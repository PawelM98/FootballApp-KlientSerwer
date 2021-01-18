package com.michcinski.demo;

import com.michcinski.demo.client.FootballClient;
import com.michcinski.demo.model.League;
import com.michcinski.demo.model.LeaugesModel;
import com.michcinski.demo.model.SavedFixture;
import com.michcinski.demo.repo.FixtureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class Start {

    private FootballClient footballClient;
    private FixtureRepo fixtureRepo;

    @Autowired
    public Start(FootballClient footballClient, FixtureRepo fixtureRepo){
        this.fixtureRepo = fixtureRepo;
        this.footballClient = footballClient;
//            List<League> mostPopularLeagues = new ArrayList<>();
//            String[] countries = {"england","spain","germany","italy","france"};
//            String[] mostPopLeagues = {"Premier League","Primera Division","Bundesliga 1","Serie A","Ligue 1"};
//            int year = Calendar.getInstance().get(Calendar.YEAR);
//            String year2 = String.valueOf(year -2);
//
//            for(String country : countries){
//                System.out.println(country);
//                assert false;
//                LeaugesModel leaugesModel = footballClient.getLeaugesByCountryAndSeason(country,year2);
//                for(int i = 0; i < leaugesModel.getApi().getLeagues().size(); i++){
//                    System.out.println(leaugesModel.getApi().getLeagues().get(i));
//                    for(String mostPopLeague: mostPopLeagues){
//                        System.out.println(mostPopLeague);
//                        if(leaugesModel.getApi().getLeagues().get(i).getName().equalsIgnoreCase(mostPopLeague)){
//                            mostPopularLeagues.add(leaugesModel.getApi().getLeagues().get(i));
//                        }
//                    }
//                }
//            }
//        SavedFixture savedFixture = new SavedFixture(592308);
//        fixtureRepo.save(savedFixture);
//        System.out.println(footballClient.getFixtureByFixtureId(savedFixture.getFixtureId()).getHomeTeam().getTeamName());
    }
//    @EventListener(ApplicationReadyEvent.class)
//    public void getSomething(){
//        List<League> mostPopularLeagues = new ArrayList<>();
//        String[] countries = {"england","spain","germany","italy","france"};
//        String[] mostPopLeagues = {"Premier League","Primera Division","Bundesliga 1","Serie A","Ligue 1"};
//        int year = Calendar.getInstance().get(Calendar.YEAR);
//        String year2 = String.valueOf(year -2);
//
//        for(String country : countries){
//            System.out.println(country);
//            System.out.println(year2);
//            LeaugesModel leaugesModel = footballClient.getLeaugesByCountryAndSeason("england","2019");
//            System.out.println(leaugesModel.getApi().getLeagues().get(0).getName());
//        }
//    }
}

