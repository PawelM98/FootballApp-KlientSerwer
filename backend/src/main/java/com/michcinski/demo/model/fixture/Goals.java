
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
    "total",
    "conceded",
    "assists",
    "saves"
})
public class Goals {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("conceded")
    private Integer conceded;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("saves")
    private Integer saves;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("conceded")
    public Integer getConceded() {
        return conceded;
    }

    @JsonProperty("conceded")
    public void setConceded(Integer conceded) {
        this.conceded = conceded;
    }

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("saves")
    public Integer getSaves() {
        return saves;
    }

    @JsonProperty("saves")
    public void setSaves(Integer saves) {
        this.saves = saves;
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
