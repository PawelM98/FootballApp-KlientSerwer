package com.michcinski.demo.service;

import com.michcinski.demo.model.Fixture;
import com.michcinski.demo.model.League;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FootballService {
    List<League> getMostPopularLeagues();
    List<League> getLeaguesListByCountryAndSeason(String country, String season);
    List<Fixture> getFixturesByLeagueId(Long id, int number);
}
