
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
    "blocks",
    "interceptions"
})
public class Tackles {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("blocks")
    private Integer blocks;
    @JsonProperty("interceptions")
    private Integer interceptions;
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

    @JsonProperty("blocks")
    public Integer getBlocks() {
        return blocks;
    }

    @JsonProperty("blocks")
    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    @JsonProperty("interceptions")
    public Integer getInterceptions() {
        return interceptions;
    }

    @JsonProperty("interceptions")
    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
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
