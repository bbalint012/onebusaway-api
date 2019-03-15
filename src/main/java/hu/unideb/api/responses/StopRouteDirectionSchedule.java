package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StopRouteDirectionSchedule {

    //https://github.com/OneBusAway/onebusaway-application-modules/blob/master/onebusaway-api-core/src/main/java/org/onebusaway/api/model/transit/StopRouteDirectionScheduleV2Bean.java
    @SerializedName("scheduleFrequencies")
    @Expose
    private List<ScheduleStopTime> scheduleFrequencies;
    
    @SerializedName("scheduleStopTimes")
    @Expose
    private List<ScheduleStopTime> scheduleStopTimes;
    
    @SerializedName("tripHeadsign")
    @Expose
    private String tripHeadsign;

    public List<ScheduleStopTime> getScheduleFrequencies() {
        return scheduleFrequencies;
    }

    public void setScheduleFrequencies(List<ScheduleStopTime> scheduleFrequencies) {
        this.scheduleFrequencies = scheduleFrequencies;
    }

    public List<ScheduleStopTime> getScheduleStopTimes() {
        return scheduleStopTimes;
    }

    public void setScheduleStopTimes(List<ScheduleStopTime> scheduleStopTimes) {
        this.scheduleStopTimes = scheduleStopTimes;
    }

    public String getTripHeadsign() {
        return tripHeadsign;
    }

    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }
    
    
}
