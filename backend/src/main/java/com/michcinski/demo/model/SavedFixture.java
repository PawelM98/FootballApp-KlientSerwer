package com.michcinski.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavedFixture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String homeTeam;
    private String awayTeam;
    private String fullScore;
    private String eventDate;
    private String homeTeamLogo;
    private String awayTeamLogo;

    public SavedFixture(String homeTeam, String awayTeam, String fullScore, String eventDate, String homeTeamLogo, String awayTeamLogo) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.fullScore = fullScore;
        this.eventDate = eventDate;
        this.homeTeamLogo = homeTeamLogo;
        this.awayTeamLogo = awayTeamLogo;
    }

    public SavedFixture() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getHomeTeamLogo() {
        return homeTeamLogo;
    }

    public void setHomeTeamLogo(String homeTeamLogo) {
        this.homeTeamLogo = homeTeamLogo;
    }

    public String getAwayTeamLogo() {
        return awayTeamLogo;
    }

    public void setAwayTeamLogo(String awayTeamLogo) {
        this.awayTeamLogo = awayTeamLogo;
    }

    @Override
    public String toString() {
        return "SavedFixture{" +
                "id=" + id +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", fullScore='" + fullScore + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", homeTeamLogo='" + homeTeamLogo + '\'' +
                ", awayTeamLogo='" + awayTeamLogo + '\'' +
                '}';
    }
}
