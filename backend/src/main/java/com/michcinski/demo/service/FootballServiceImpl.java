package com.michcinski.demo.service;

import com.michcinski.demo.client.FootballClient;
import com.michcinski.demo.model.League;
import com.michcinski.demo.model.LeaugesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class FootballServiceImpl implements FootballService{


    private FootballClient footballClient;

    @Autowired
    public FootballServiceImpl(FootballClient footballClient){
        this.footballClient = footballClient;
    }

    @Override
    public List<League> getMostPopularLeagues() {

        List<League> mostPopularLeagues = new ArrayList<>();
        String[] countries = {"england","spain","germany","italy","france"};
        String[] mostPopLeagues = {"Premier League","Primera Division","Bundesliga 1","Serie A","Ligue 1"};
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String year2 = String.valueOf(year - 1);

        for(String country : countries){
            LeaugesModel leaugesModel = footballClient.getLeaugesByCountryAndSeason(country,year2);
            for(int i = 0; i < leaugesModel.getApi().getLeagues().size(); i++){
                for(String mostPopLeague: mostPopLeagues){
                    if(leaugesModel.getApi().getLeagues().get(i).getName().equalsIgnoreCase(mostPopLeague)){
                    mostPopularLeagues.add(leaugesModel.getApi().getLeagues().get(i));
                    }
                }
            }
        }
        return mostPopularLeagues;
    }
}
