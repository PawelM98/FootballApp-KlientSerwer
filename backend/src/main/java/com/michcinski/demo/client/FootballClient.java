package com.michcinski.demo.client;

import com.michcinski.demo.model.Fixture;
import com.michcinski.demo.model.FixturesModel;
import com.michcinski.demo.model.LeaugesModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Stream;

@Service
public class FootballClient {

    RestTemplate restTemplate = new RestTemplate();

    public LeaugesModel getLeaugesByCountryAndSeason(String country, String season){
        MultiValueMap<String,String> headers = new HttpHeaders();
        headers.set("x-rapidapi-key", "af6c5c87bcmsh4eeb2aeac728111p14ba02jsn7fdd65ec5b91");
        headers.set("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<LeaugesModel> exchange = restTemplate.exchange("https://api-football-v1.p.rapidapi.com/v2/leagues/country/"+ country + "/" + season,
                HttpMethod.GET,
                httpEntity,
                LeaugesModel.class);
        return exchange.getBody();
    }

    public FixturesModel getFixturesByLeagueId(Long id, int number){
        MultiValueMap<String,String> headers = new HttpHeaders();
        headers.set("x-rapidapi-key", "af6c5c87bcmsh4eeb2aeac728111p14ba02jsn7fdd65ec5b91");
        headers.set("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<FixturesModel> exchange = restTemplate.exchange("https://api-football-v1.p.rapidapi.com/v2/fixtures/league/"+id+"/last/" + number,
                HttpMethod.GET,
                httpEntity,
                FixturesModel.class);
        return exchange.getBody();
    }

    public FixturesModel getFixtureByFixtureId(int id){
        MultiValueMap<String,String> headers = new HttpHeaders();
        headers.set("x-rapidapi-key", "af6c5c87bcmsh4eeb2aeac728111p14ba02jsn7fdd65ec5b91");
        headers.set("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        HttpEntity httpEntity = new HttpEntity(headers);

        ResponseEntity<FixturesModel> exchange = restTemplate.exchange("https://api-football-v1.p.rapidapi.com/v2/fixtures/id/"+id,
                HttpMethod.GET,
                httpEntity,
                FixturesModel.class);
        return exchange.getBody();
    }
}
