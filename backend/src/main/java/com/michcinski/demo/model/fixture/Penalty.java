
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
    "won",
    "commited",
    "success",
    "missed",
    "saved"
})
public class Penalty {

    @JsonProperty("won")
    private Integer won;
    @JsonProperty("commited")
    private Integer commited;
    @JsonProperty("success")
    private Integer success;
    @JsonProperty("missed")
    private Integer missed;
    @JsonProperty("saved")
    private Integer saved;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("won")
    public Integer getWon() {
        return won;
    }

    @JsonProperty("won")
    public void setWon(Integer won) {
        this.won = won;
    }

    @JsonProperty("commited")
    public Integer getCommited() {
        return commited;
    }

    @JsonProperty("commited")
    public void setCommited(Integer commited) {
        this.commited = commited;
    }

    @JsonProperty("success")
    public Integer getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Integer success) {
        this.success = success;
    }

    @JsonProperty("missed")
    public Integer getMissed() {
        return missed;
    }

    @JsonProperty("missed")
    public void setMissed(Integer missed) {
        this.missed = missed;
    }

    @JsonProperty("saved")
    public Integer getSaved() {
        return saved;
    }

    @JsonProperty("saved")
    public void setSaved(Integer saved) {
        this.saved = saved;
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
