
package com.michcinski.demo.model.fixture;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "event_id",
    "updateAt",
    "player_id",
    "player_name",
    "team_id",
    "team_name",
    "number",
    "position",
    "rating",
    "minutes_played",
    "captain",
    "substitute",
    "offsides",
    "shots",
    "goals",
    "passes",
    "tackles",
    "duels",
    "dribbles",
    "fouls",
    "cards",
    "penalty"
})
public class Player {

    @JsonProperty("event_id")
    private Integer eventId;
    @JsonProperty("updateAt")
    private Integer updateAt;
    @JsonProperty("player_id")
    private Integer playerId;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("team_id")
    private Integer teamId;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("position")
    private String position;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("minutes_played")
    private Integer minutesPlayed;
    @JsonProperty("captain")
    private String captain;
    @JsonProperty("substitute")
    private String substitute;
    @JsonProperty("offsides")
    private Object offsides;
    @JsonProperty("shots")
    private Shots shots;
    @JsonProperty("goals")
    private Goals goals;
    @JsonProperty("passes")
    private Passes_ passes;
    @JsonProperty("tackles")
    private Tackles tackles;
    @JsonProperty("duels")
    private Duels duels;
    @JsonProperty("dribbles")
    private Dribbles dribbles;
    @JsonProperty("fouls")
    private Fouls_ fouls;
    @JsonProperty("cards")
    private Cards cards;
    @JsonProperty("penalty")
    private Penalty penalty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("event_id")
    public Integer getEventId() {
        return eventId;
    }

    @JsonProperty("event_id")
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("updateAt")
    public Integer getUpdateAt() {
        return updateAt;
    }

    @JsonProperty("updateAt")
    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    @JsonProperty("player_id")
    public Integer getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("player_name")
    public String getPlayerName() {
        return playerName;
    }

    @JsonProperty("player_name")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("team_id")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("minutes_played")
    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    @JsonProperty("minutes_played")
    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    @JsonProperty("captain")
    public String getCaptain() {
        return captain;
    }

    @JsonProperty("captain")
    public void setCaptain(String captain) {
        this.captain = captain;
    }

    @JsonProperty("substitute")
    public String getSubstitute() {
        return substitute;
    }

    @JsonProperty("substitute")
    public void setSubstitute(String substitute) {
        this.substitute = substitute;
    }

    @JsonProperty("offsides")
    public Object getOffsides() {
        return offsides;
    }

    @JsonProperty("offsides")
    public void setOffsides(Object offsides) {
        this.offsides = offsides;
    }

    @JsonProperty("shots")
    public Shots getShots() {
        return shots;
    }

    @JsonProperty("shots")
    public void setShots(Shots shots) {
        this.shots = shots;
    }

    @JsonProperty("goals")
    public Goals getGoals() {
        return goals;
    }

    @JsonProperty("goals")
    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    @JsonProperty("passes")
    public Passes_ getPasses() {
        return passes;
    }

    @JsonProperty("passes")
    public void setPasses(Passes_ passes) {
        this.passes = passes;
    }

    @JsonProperty("tackles")
    public Tackles getTackles() {
        return tackles;
    }

    @JsonProperty("tackles")
    public void setTackles(Tackles tackles) {
        this.tackles = tackles;
    }

    @JsonProperty("duels")
    public Duels getDuels() {
        return duels;
    }

    @JsonProperty("duels")
    public void setDuels(Duels duels) {
        this.duels = duels;
    }

    @JsonProperty("dribbles")
    public Dribbles getDribbles() {
        return dribbles;
    }

    @JsonProperty("dribbles")
    public void setDribbles(Dribbles dribbles) {
        this.dribbles = dribbles;
    }

    @JsonProperty("fouls")
    public Fouls_ getFouls() {
        return fouls;
    }

    @JsonProperty("fouls")
    public void setFouls(Fouls_ fouls) {
        this.fouls = fouls;
    }

    @JsonProperty("cards")
    public Cards getCards() {
        return cards;
    }

    @JsonProperty("cards")
    public void setCards(Cards cards) {
        this.cards = cards;
    }

    @JsonProperty("penalty")
    public Penalty getPenalty() {
        return penalty;
    }

    @JsonProperty("penalty")
    public void setPenalty(Penalty penalty) {
        this.penalty = penalty;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
