
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
    "Shots on Goal",
    "Shots off Goal",
    "Total Shots",
    "Blocked Shots",
    "Shots insidebox",
    "Shots outsidebox",
    "Fouls",
    "Corner Kicks",
    "Offsides",
    "Ball Possession",
    "Yellow Cards",
    "Red Cards",
    "Goalkeeper Saves",
    "Total passes",
    "Passes accurate",
    "Passes %"
})
public class Statistics {

    @JsonProperty("Shots on Goal")
    private ShotsOnGoal shotsOnGoal;
    @JsonProperty("Shots off Goal")
    private ShotsOffGoal shotsOffGoal;
    @JsonProperty("Total Shots")
    private TotalShots totalShots;
    @JsonProperty("Blocked Shots")
    private BlockedShots blockedShots;
    @JsonProperty("Shots insidebox")
    private ShotsInsidebox shotsInsidebox;
    @JsonProperty("Shots outsidebox")
    private ShotsOutsidebox shotsOutsidebox;
    @JsonProperty("Fouls")
    private Fouls fouls;
    @JsonProperty("Corner Kicks")
    private CornerKicks cornerKicks;
    @JsonProperty("Offsides")
    private Offsides offsides;
    @JsonProperty("Ball Possession")
    private BallPossession ballPossession;
    @JsonProperty("Yellow Cards")
    private YellowCards yellowCards;
    @JsonProperty("Red Cards")
    private RedCards redCards;
    @JsonProperty("Goalkeeper Saves")
    private GoalkeeperSaves goalkeeperSaves;
    @JsonProperty("Total passes")
    private TotalPasses totalPasses;
    @JsonProperty("Passes accurate")
    private PassesAccurate passesAccurate;
    @JsonProperty("Passes %")
    private Passes passes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Shots on Goal")
    public ShotsOnGoal getShotsOnGoal() {
        return shotsOnGoal;
    }

    @JsonProperty("Shots on Goal")
    public void setShotsOnGoal(ShotsOnGoal shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    @JsonProperty("Shots off Goal")
    public ShotsOffGoal getShotsOffGoal() {
        return shotsOffGoal;
    }

    @JsonProperty("Shots off Goal")
    public void setShotsOffGoal(ShotsOffGoal shotsOffGoal) {
        this.shotsOffGoal = shotsOffGoal;
    }

    @JsonProperty("Total Shots")
    public TotalShots getTotalShots() {
        return totalShots;
    }

    @JsonProperty("Total Shots")
    public void setTotalShots(TotalShots totalShots) {
        this.totalShots = totalShots;
    }

    @JsonProperty("Blocked Shots")
    public BlockedShots getBlockedShots() {
        return blockedShots;
    }

    @JsonProperty("Blocked Shots")
    public void setBlockedShots(BlockedShots blockedShots) {
        this.blockedShots = blockedShots;
    }

    @JsonProperty("Shots insidebox")
    public ShotsInsidebox getShotsInsidebox() {
        return shotsInsidebox;
    }

    @JsonProperty("Shots insidebox")
    public void setShotsInsidebox(ShotsInsidebox shotsInsidebox) {
        this.shotsInsidebox = shotsInsidebox;
    }

    @JsonProperty("Shots outsidebox")
    public ShotsOutsidebox getShotsOutsidebox() {
        return shotsOutsidebox;
    }

    @JsonProperty("Shots outsidebox")
    public void setShotsOutsidebox(ShotsOutsidebox shotsOutsidebox) {
        this.shotsOutsidebox = shotsOutsidebox;
    }

    @JsonProperty("Fouls")
    public Fouls getFouls() {
        return fouls;
    }

    @JsonProperty("Fouls")
    public void setFouls(Fouls fouls) {
        this.fouls = fouls;
    }

    @JsonProperty("Corner Kicks")
    public CornerKicks getCornerKicks() {
        return cornerKicks;
    }

    @JsonProperty("Corner Kicks")
    public void setCornerKicks(CornerKicks cornerKicks) {
        this.cornerKicks = cornerKicks;
    }

    @JsonProperty("Offsides")
    public Offsides getOffsides() {
        return offsides;
    }

    @JsonProperty("Offsides")
    public void setOffsides(Offsides offsides) {
        this.offsides = offsides;
    }

    @JsonProperty("Ball Possession")
    public BallPossession getBallPossession() {
        return ballPossession;
    }

    @JsonProperty("Ball Possession")
    public void setBallPossession(BallPossession ballPossession) {
        this.ballPossession = ballPossession;
    }

    @JsonProperty("Yellow Cards")
    public YellowCards getYellowCards() {
        return yellowCards;
    }

    @JsonProperty("Yellow Cards")
    public void setYellowCards(YellowCards yellowCards) {
        this.yellowCards = yellowCards;
    }

    @JsonProperty("Red Cards")
    public RedCards getRedCards() {
        return redCards;
    }

    @JsonProperty("Red Cards")
    public void setRedCards(RedCards redCards) {
        this.redCards = redCards;
    }

    @JsonProperty("Goalkeeper Saves")
    public GoalkeeperSaves getGoalkeeperSaves() {
        return goalkeeperSaves;
    }

    @JsonProperty("Goalkeeper Saves")
    public void setGoalkeeperSaves(GoalkeeperSaves goalkeeperSaves) {
        this.goalkeeperSaves = goalkeeperSaves;
    }

    @JsonProperty("Total passes")
    public TotalPasses getTotalPasses() {
        return totalPasses;
    }

    @JsonProperty("Total passes")
    public void setTotalPasses(TotalPasses totalPasses) {
        this.totalPasses = totalPasses;
    }

    @JsonProperty("Passes accurate")
    public PassesAccurate getPassesAccurate() {
        return passesAccurate;
    }

    @JsonProperty("Passes accurate")
    public void setPassesAccurate(PassesAccurate passesAccurate) {
        this.passesAccurate = passesAccurate;
    }

    @JsonProperty("Passes %")
    public Passes getPasses() {
        return passes;
    }

    @JsonProperty("Passes %")
    public void setPasses(Passes passes) {
        this.passes = passes;
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
