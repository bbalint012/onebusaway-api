package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Frequency {

    @SerializedName("id")
    @Expose
    private Long id;

    @SerializedName("trip")
    @Expose
    private Trip trip;

    @SerializedName("startTime")
    @Expose
    private Long startTime;

    @SerializedName("endTime")
    @Expose
    private Long endTime;

    @SerializedName("headwaySecs")
    @Expose
    private Long headwaySecs;

    @SerializedName("exactTimes")
    @Expose
    private Long exactTimes;

    @SerializedName("labelOnly")
    @Expose
    private Long labelOnly;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getHeadwaySecs() {
        return headwaySecs;
    }

    public void setHeadwaySecs(Long headwaySecs) {
        this.headwaySecs = headwaySecs;
    }

    public Long getExactTimes() {
        return exactTimes;
    }

    public void setExactTimes(Long exactTimes) {
        this.exactTimes = exactTimes;
    }

    public Long getLabelOnly() {
        return labelOnly;
    }

    public void setLabelOnly(Long labelOnly) {
        this.labelOnly = labelOnly;
    }
    
    
}
