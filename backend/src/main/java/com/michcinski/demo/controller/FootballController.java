package com.michcinski.demo.controller;

import com.michcinski.demo.client.FootballClient;
import com.michcinski.demo.model.*;
import com.michcinski.demo.repo.FixtureRepo;
import com.michcinski.demo.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FootballController {

    private FootballClient footballClient;
    private FootballService footballService;
    private FixtureRepo fixtureRepo;

    @Autowired
    public FootballController(FootballClient footballClient, FootballService footballService, FixtureRepo fixtureRepo){
        this.footballClient = footballClient;
        this.footballService = footballService;
        this.fixtureRepo = fixtureRepo;
    }

    @GetMapping("/")
    public String getLeaugeListByCountry(@ModelAttribute("leaguesList") LeaugesModel leaugesModel, Model model){
        model.addAttribute("requirements", new UserRequirements());
        model.addAttribute("mostPopularLeagues", footballService.getMostPopularLeagues());
        return "home";
    }

    @PostMapping("/findLeagues")
    public String addRequirements(@ModelAttribute UserRequirements userRequirements, Model model){
        model.addAttribute("leaguesListt", footballClient.getLeaugesByCountryAndSeason(userRequirements.getCountry(), userRequirements.getSeason()));
        return "plan";
    }

    @GetMapping("leaguesFixturesByIdGet/{id}")
    public String getListPage(@PathVariable Long id,@ModelAttribute FixtureRequirements fixtureRequirements, Model model){
        FixtureRequirements fixtureRequirements1 = new FixtureRequirements();
        fixtureRequirements1.setId(id);
        model.addAttribute("fixtureRequirements", fixtureRequirements1);
        return "fixturesRequirements";
    }


    @PostMapping("leaguesFixturesById/{id}")
    public String getLeagueFixturesById(@PathVariable Long id, Model model, int number){
        model.addAttribute("fixturesList", footballClient.getFixturesByLeagueId(id, number));
        return "fixturesListPage";
    }

    @GetMapping("leaguesFixturesMostPopular/{id}/5")
    public String getMostPopularLeagueFixturesById(@PathVariable Long id, Model model){
        model.addAttribute("fixturesList", footballClient.getFixturesByLeagueId(id, 5));
        return "fixturesListPage";
    }

    @PostMapping("saveFixture/{id}")
    public String saveFixture(@PathVariable int id){
        SavedFixture savedFixture = new SavedFixture();
        savedFixture.setFixtureId(id);
        fixtureRepo.save(savedFixture);
        return "redirect:/savedFixtures";
    }

    @GetMapping("savedFixtures")
    public String getSavedFixtures(Model model){
        List<Fixture> savedFixturesList = new ArrayList<>();
        List<SavedFixture> fixturesIds = fixtureRepo.findAll();
        for(SavedFixture fixtureId : fixturesIds){
            Fixture fixture = footballClient.getFixtureByFixtureId(fixtureId.getFixtureId());
            savedFixturesList.add(fixture);
        }
        model.addAttribute("savedFixturesList", savedFixturesList);
        return "savedFixturesPage";
    }

    @GetMapping("deleteFixture/{id}")
    public String deleteFixture(@PathVariable int id){
        SavedFixture savedFixture = new SavedFixture();
        savedFixture.setFixtureId(id);
        fixtureRepo.delete(savedFixture);
        return "redirect:savedFixtures";
    }

}
