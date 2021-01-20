package com.michcinski.demo.controller;

import com.michcinski.demo.client.FootballClient;
import com.michcinski.demo.model.*;
import com.michcinski.demo.repo.FixtureRepo;
import com.michcinski.demo.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FootballRestController {

    private FootballClient footballClient;
    private FootballService footballService;
    private FixtureRepo fixtureRepo;

    @Autowired
    public FootballRestController(FootballClient footballClient, FootballService footballService, FixtureRepo fixtureRepo){
        this.footballClient = footballClient;
        this.footballService = footballService;
        this.fixtureRepo = fixtureRepo;
    }

    @GetMapping("all")
    public ResponseEntity<List<League>> getMostPopularLeaguesList(){
        return new ResponseEntity<>(footballService.getMostPopularLeagues(), HttpStatus.OK);
    }

    @GetMapping("/findLeaguesByCountryAndSeason/{country}/{season}")
    public ResponseEntity<List<League>> getLeaguesByCountryAndSeason(@PathVariable String country, @PathVariable String season){
        if(footballService.getLeaguesListByCountryAndSeason(country,season) != null){
            return new ResponseEntity<>(footballService.getLeaguesListByCountryAndSeason(country,season),HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getFixtureByLeagueId/{id}/{number}")
    public ResponseEntity<List<Fixture>> getFixturesByLeagueId(@PathVariable Long id, @PathVariable int number){
        if(footballService.getFixturesByLeagueId(id,number) != null){
            return new ResponseEntity<>(footballService.getFixturesByLeagueId(id,number),HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/saveFixture")
    public ResponseEntity<?> saveFixture(@RequestBody SavedFixture savedFixture){
        fixtureRepo.save(savedFixture);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getFixtures")
    public ResponseEntity<?> getFixtures(){
        return new ResponseEntity<>(fixtureRepo.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteFixture/{id}")
    public ResponseEntity<?> deleteFixture(@PathVariable Long id){
        fixtureRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
