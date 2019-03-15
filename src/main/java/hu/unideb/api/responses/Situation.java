package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Situation {

    @SerializedName("id")
    @Expose
    private String id;
    
    @SerializedName("creationTime")
    @Expose
    private String creationTime;
    
    @SerializedName("environmentReason")
    @Expose
    private String environmentReason;
    
    @SerializedName("summary")
    @Expose
    private Summary summary;
    
    @SerializedName("description")
    @Expose
    private Description description;
    
    @SerializedName("affects")
    @Expose
    private Affects affects;
    
    @SerializedName("consequences")
    @Expose
    private Consequences consequences;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getEnvironmentReason() {
        return environmentReason;
    }

    public void setEnvironmentReason(String environmentReason) {
        this.environmentReason = environmentReason;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Affects getAffects() {
        return affects;
    }

    public void setAffects(Affects affects) {
        this.affects = affects;
    }

    public Consequences getConsequences() {
        return consequences;
    }

    public void setConsequences(Consequences consequences) {
        this.consequences = consequences;
    }
    
    
}
