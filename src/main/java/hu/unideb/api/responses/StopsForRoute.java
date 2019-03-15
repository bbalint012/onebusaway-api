package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StopsForRoute {

    @SerializedName("polylines")
    @Expose
    private List<Polyline> polylines;
    
    @SerializedName("routeId")
    @Expose
    private String routeId;
    
    @SerializedName("stopGroupings")
    @Expose
    private List<StopGrouping> stopGroupings;
    
    @SerializedName("stopIds")
    @Expose
    private List<String> stopIds;

    
    public List<Polyline> getPolylines() {
        return polylines;
    }

    public void setPolylines(List<Polyline> polylines) {
        this.polylines = polylines;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public List<StopGrouping> getStopGroupings() {
        return stopGroupings;
    }

    public void setStopGroupings(List<StopGrouping> stopGroupings) {
        this.stopGroupings = stopGroupings;
    }

    public List<String> getStopIds() {
        return stopIds;
    }

    public void setStopIds(List<String> stopIds) {
        this.stopIds = stopIds;
    }
    
}
