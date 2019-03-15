package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TripStatus {

    @SerializedName("activeTripId")
    @Expose
    private String activeTripId;
    
    @SerializedName("blockTripSequence")
    @Expose
    private Integer blockTripSequence;
    
    @SerializedName("closestStop")
    @Expose
    private String closestStop;
    
    @SerializedName("closestStopTimeOffset")
    @Expose
    private Long closestStopTimeOffset;
    
    @SerializedName("distanceAlongTrip")
    @Expose
    private Long distanceAlongTrip;
    
    @SerializedName("frequency")
    @Expose
    private Frequency frequency;
    
    @SerializedName("lastKnownDistanceAlongTrip")
    @Expose
    private Long lastKnownDistanceAlongTrip;
    
    @SerializedName("lastKnownLocation")
    @Expose
    private Position lastKnownLocation;
    
    @SerializedName("lastKnownOrientation")
    @Expose
    private Long lastKnownOrientation;
    
    @SerializedName("lastLocationUpdateTime")
    @Expose
    private Long lastLocationUpdateTime;
    
    @SerializedName("lastUpdateTime")
    @Expose
    private Long lastUpdateTime;
    
    @SerializedName("nextStop")
    @Expose
    private String nextStop;
    
    @SerializedName("nextStopTimeOffset")
    @Expose
    private Long nextStopTimeOffset;
    
    @SerializedName("orientation")
    @Expose
    private Double orientation;
    
    @SerializedName("phase")
    @Expose
    private String phase;
    
    @SerializedName("position")
    @Expose
    private Position position;
    
    @SerializedName("predicted")
    @Expose
    private Boolean predicted;
    
    @SerializedName("scheduleDeviation")
    @Expose
    private Integer scheduleDeviation;
    
    @SerializedName("scheduledDistanceAlongTrip")
    @Expose
    private Integer scheduledDistanceAlongTrip;
    
    @SerializedName("serviceDate")
    @Expose
    private Long serviceDate;
    
    @SerializedName("situationIds")
    @Expose
    private List<String> situationIds;
    
    @SerializedName("status")
    @Expose
    private String status;
    
    @SerializedName("totalDistanceAlongTrip")
    @Expose
    private Double totalDistanceAlongTrip;
    
    @SerializedName("vehicleId")
    @Expose
    private String vehicleId;

    
    public String getActiveTripId() {
        return activeTripId;
    }

    public void setActiveTripId(String activeTripId) {
        this.activeTripId = activeTripId;
    }

    public Integer getBlockTripSequence() {
        return blockTripSequence;
    }

    public void setBlockTripSequence(Integer blockTripSequence) {
        this.blockTripSequence = blockTripSequence;
    }

    public String getClosestStop() {
        return closestStop;
    }

    public void setClosestStop(String closestStop) {
        this.closestStop = closestStop;
    }

    public Long getClosestStopTimeOffset() {
        return closestStopTimeOffset;
    }

    public void setClosestStopTimeOffset(Long closestStopTimeOffset) {
        this.closestStopTimeOffset = closestStopTimeOffset;
    }

    public Long getDistanceAlongTrip() {
        return distanceAlongTrip;
    }

    public void setDistanceAlongTrip(Long distanceAlongTrip) {
        this.distanceAlongTrip = distanceAlongTrip;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Long getLastKnownDistanceAlongTrip() {
        return lastKnownDistanceAlongTrip;
    }

    public void setLastKnownDistanceAlongTrip(Long lastKnownDistanceAlongTrip) {
        this.lastKnownDistanceAlongTrip = lastKnownDistanceAlongTrip;
    }

    public Position getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Position lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public Long getLastKnownOrientation() {
        return lastKnownOrientation;
    }

    public void setLastKnownOrientation(Long lastKnownOrientation) {
        this.lastKnownOrientation = lastKnownOrientation;
    }

    public Long getLastLocationUpdateTime() {
        return lastLocationUpdateTime;
    }

    public void setLastLocationUpdateTime(Long lastLocationUpdateTime) {
        this.lastLocationUpdateTime = lastLocationUpdateTime;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getNextStop() {
        return nextStop;
    }

    public void setNextStop(String nextStop) {
        this.nextStop = nextStop;
    }

    public Long getNextStopTimeOffset() {
        return nextStopTimeOffset;
    }

    public void setNextStopTimeOffset(Long nextStopTimeOffset) {
        this.nextStopTimeOffset = nextStopTimeOffset;
    }

    public Double getOrientation() {
        return orientation;
    }

    public void setOrientation(Double orientation) {
        this.orientation = orientation;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Boolean getPredicted() {
        return predicted;
    }

    public void setPredicted(Boolean predicted) {
        this.predicted = predicted;
    }

    public Integer getScheduleDeviation() {
        return scheduleDeviation;
    }

    public void setScheduleDeviation(Integer scheduleDeviation) {
        this.scheduleDeviation = scheduleDeviation;
    }

    public Integer getScheduledDistanceAlongTrip() {
        return scheduledDistanceAlongTrip;
    }

    public void setScheduledDistanceAlongTrip(Integer scheduledDistanceAlongTrip) {
        this.scheduledDistanceAlongTrip = scheduledDistanceAlongTrip;
    }

    public Long getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Long serviceDate) {
        this.serviceDate = serviceDate;
    }

    public List<String> getSituationIds() {
        return situationIds;
    }

    public void setSituationIds(List<String> situationIds) {
        this.situationIds = situationIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalDistanceAlongTrip() {
        return totalDistanceAlongTrip;
    }

    public void setTotalDistanceAlongTrip(Double totalDistanceAlongTrip) {
        this.totalDistanceAlongTrip = totalDistanceAlongTrip;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    
    
}
