package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StopGrouping {

    @SerializedName("ordered")
    @Expose
    private Boolean ordered;
    
    @SerializedName("stopGroups")
    @Expose
    private List<StopGroup> stopGroups;
    
    @SerializedName("type")
    @Expose
    private String type;

    
    public Boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(Boolean ordered) {
        this.ordered = ordered;
    }

    public List<StopGroup> getStopGroups() {
        return stopGroups;
    }

    public void setStopGroups(List<StopGroup> stopGroups) {
        this.stopGroups = stopGroups;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
