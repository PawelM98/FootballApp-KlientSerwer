
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
    "yellow",
    "red"
})
public class Cards {

    @JsonProperty("yellow")
    private Integer yellow;
    @JsonProperty("red")
    private Integer red;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("yellow")
    public Integer getYellow() {
        return yellow;
    }

    @JsonProperty("yellow")
    public void setYellow(Integer yellow) {
        this.yellow = yellow;
    }

    @JsonProperty("red")
    public Integer getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(Integer red) {
        this.red = red;
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
