
package com.michcinski.demo.model;

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
    "elapsed",
    "elapsed_plus",
    "team_id",
    "teamName",
    "player_id",
    "player",
    "assist_id",
    "assist",
    "type",
    "detail",
    "comments"
})
public class Event {

    @JsonProperty("elapsed")
    private Integer elapsed;
    @JsonProperty("elapsed_plus")
    private Object elapsedPlus;
    @JsonProperty("team_id")
    private Integer teamId;
    @JsonProperty("teamName")
    private String teamName;
    @JsonProperty("player_id")
    private Integer playerId;
    @JsonProperty("player")
    private String player;
    @JsonProperty("assist_id")
    private Object assistId;
    @JsonProperty("assist")
    private Object assist;
    @JsonProperty("type")
    private String type;
    @JsonProperty("detail")
    private String detail;
    @JsonProperty("comments")
    private Object comments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("elapsed")
    public Integer getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    @JsonProperty("elapsed_plus")
    public Object getElapsedPlus() {
        return elapsedPlus;
    }

    @JsonProperty("elapsed_plus")
    public void setElapsedPlus(Object elapsedPlus) {
        this.elapsedPlus = elapsedPlus;
    }

    @JsonProperty("team_id")
    public Integer getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("teamName")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("teamName")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("player_id")
    public Integer getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("player")
    public String getPlayer() {
        return player;
    }

    @JsonProperty("player")
    public void setPlayer(String player) {
        this.player = player;
    }

    @JsonProperty("assist_id")
    public Object getAssistId() {
        return assistId;
    }

    @JsonProperty("assist_id")
    public void setAssistId(Object assistId) {
        this.assistId = assistId;
    }

    @JsonProperty("assist")
    public Object getAssist() {
        return assist;
    }

    @JsonProperty("assist")
    public void setAssist(Object assist) {
        this.assist = assist;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @JsonProperty("comments")
    public Object getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Object comments) {
        this.comments = comments;
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
