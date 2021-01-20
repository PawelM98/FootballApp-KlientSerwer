
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
    "drawn",
    "committed"
})
public class Fouls_ {

    @JsonProperty("drawn")
    private Integer drawn;
    @JsonProperty("committed")
    private Integer committed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("drawn")
    public Integer getDrawn() {
        return drawn;
    }

    @JsonProperty("drawn")
    public void setDrawn(Integer drawn) {
        this.drawn = drawn;
    }

    @JsonProperty("committed")
    public Integer getCommitted() {
        return committed;
    }

    @JsonProperty("committed")
    public void setCommitted(Integer committed) {
        this.committed = committed;
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
