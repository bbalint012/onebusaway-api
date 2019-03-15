package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StopRouteSchedule {

    @SerializedName("routeId")
    @Expose
    private String routeId;
    
    @SerializedName("stopRouteDirectionSchedules")
    @Expose
    private List<StopRouteDirectionSchedule> stopRouteDirectionSchedules;

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public List<StopRouteDirectionSchedule> getStopRouteDirectionSchedules() {
        return stopRouteDirectionSchedules;
    }

    public void setStopRouteDirectionSchedules(List<StopRouteDirectionSchedule> stopRouteDirectionSchedules) {
        this.stopRouteDirectionSchedules = stopRouteDirectionSchedules;
    }
    
    
    
}
