package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScheduleStopTime {

    @SerializedName("arrivalEnabled")
    @Expose
    private Boolean arrivalEnabled;
    
    @SerializedName("arrivalTime")
    @Expose
    private Long arrivalTime;
    
    @SerializedName("departureEnabled")
    @Expose
    private Boolean departureEnabled;
    
    @SerializedName("departureTime")
    @Expose
    private Long departureTime;
    
    @SerializedName("serviceId")
    @Expose
    private String serviceId;
    
    @SerializedName("stopHeadsign")
    @Expose
    private String stopHeadsign;
    
    @SerializedName("tripId")
    @Expose
    private String tripId;

    public Boolean getArrivalEnabled() {
        return arrivalEnabled;
    }

    public void setArrivalEnabled(Boolean arrivalEnabled) {
        this.arrivalEnabled = arrivalEnabled;
    }

    public Long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Boolean getDepartureEnabled() {
        return departureEnabled;
    }

    public void setDepartureEnabled(Boolean departureEnabled) {
        this.departureEnabled = departureEnabled;
    }

    public Long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Long departureTime) {
        this.departureTime = departureTime;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getStopHeadsign() {
        return stopHeadsign;
    }

    public void setStopHeadsign(String stopHeadsign) {
        this.stopHeadsign = stopHeadsign;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }
    
    

}
