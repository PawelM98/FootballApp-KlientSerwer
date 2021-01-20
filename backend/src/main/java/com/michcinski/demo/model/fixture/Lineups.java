
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
    "Bordeaux",
    "Saint Etienne"
})
public class Lineups {

    @JsonProperty("Bordeaux")
    private Bordeaux bordeaux;
    @JsonProperty("Saint Etienne")
    private SaintEtienne saintEtienne;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Bordeaux")
    public Bordeaux getBordeaux() {
        return bordeaux;
    }

    @JsonProperty("Bordeaux")
    public void setBordeaux(Bordeaux bordeaux) {
        this.bordeaux = bordeaux;
    }

    @JsonProperty("Saint Etienne")
    public SaintEtienne getSaintEtienne() {
        return saintEtienne;
    }

    @JsonProperty("Saint Etienne")
    public void setSaintEtienne(SaintEtienne saintEtienne) {
        this.saintEtienne = saintEtienne;
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
