
package com.cooltrickshome;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NAME",
    "SPORT",
    "AGE",
    "ID",
    "LAST_SCORES"
})
@Generated("jsonschema2pojo")
public class Input {

    @JsonProperty("NAME")
    public String name;
    @JsonProperty("SPORT")
    public String sport;
    @JsonProperty("AGE")
    public Integer age;
    @JsonProperty("ID")
    public Integer id;
    @JsonProperty("LAST_SCORES")
    public List<Integer> lastScores = new ArrayList<Integer>();

}
