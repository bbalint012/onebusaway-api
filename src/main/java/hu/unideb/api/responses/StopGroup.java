package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StopGroup {

    @SerializedName("id")
    @Expose
    private String id;
    
    @SerializedName("name")
    @Expose
    private StopName name;
    
    @SerializedName("polylines")
    @Expose
    private List<Polyline> polylines;
    
    @SerializedName("stopIds")
    @Expose
    private List<String> stopIds;
    
    @SerializedName("subGroups")
    @Expose
    private List<StopGroup> subGroups;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StopName getName() {
        return name;
    }

    public void setName(StopName name) {
        this.name = name;
    }

    public List<Polyline> getPolylines() {
        return polylines;
    }

    public void setPolylines(List<Polyline> polylines) {
        this.polylines = polylines;
    }

    public List<String> getStopIds() {
        return stopIds;
    }

    public void setStopIds(List<String> stopIds) {
        this.stopIds = stopIds;
    }

    public List<StopGroup> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(List<StopGroup> subGroups) {
        this.subGroups = subGroups;
    }
    
}
