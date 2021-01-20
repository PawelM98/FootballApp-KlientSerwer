
package com.michcinski.demo.model.fixture;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coach",
    "coach_id",
    "formation",
    "startXI",
    "substitutes"
})
public class Bordeaux {

    @JsonProperty("coach")
    private String coach;
    @JsonProperty("coach_id")
    private Integer coachId;
    @JsonProperty("formation")
    private String formation;
    @JsonProperty("startXI")
    private List<StartXI> startXI = null;
    @JsonProperty("substitutes")
    private List<Substitute> substitutes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coach")
    public String getCoach() {
        return coach;
    }

    @JsonProperty("coach")
    public void setCoach(String coach) {
        this.coach = coach;
    }

    @JsonProperty("coach_id")
    public Integer getCoachId() {
        return coachId;
    }

    @JsonProperty("coach_id")
    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    @JsonProperty("formation")
    public String getFormation() {
        return formation;
    }

    @JsonProperty("formation")
    public void setFormation(String formation) {
        this.formation = formation;
    }

    @JsonProperty("startXI")
    public List<StartXI> getStartXI() {
        return startXI;
    }

    @JsonProperty("startXI")
    public void setStartXI(List<StartXI> startXI) {
        this.startXI = startXI;
    }

    @JsonProperty("substitutes")
    public List<Substitute> getSubstitutes() {
        return substitutes;
    }

    @JsonProperty("substitutes")
    public void setSubstitutes(List<Substitute> substitutes) {
        this.substitutes = substitutes;
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
