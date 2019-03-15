package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StopSchedule {

    @SerializedName("date")
    @Expose
    private Long date;
    
    @SerializedName("stopId")
    @Expose
    private String stopId;
    
    @SerializedName("stopRouteSchedules")
    @Expose
    private List<StopRouteSchedule> stopRouteSchedules;

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public List<StopRouteSchedule> getStopRouteSchedules() {
        return stopRouteSchedules;
    }

    public void setStopRouteSchedules(List<StopRouteSchedule> stopRouteSchedules) {
        this.stopRouteSchedules = stopRouteSchedules;
    }
    
    
}
