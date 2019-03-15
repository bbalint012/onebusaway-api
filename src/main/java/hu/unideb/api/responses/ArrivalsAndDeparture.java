package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ArrivalsAndDeparture {

    @SerializedName("arrivalEnabled")
    @Expose
    private Boolean arrivalEnabled;
    
    @SerializedName("blockTripSequence")
    @Expose
    private Integer blockTripSequence;
    
    @SerializedName("departureEnabled")
    @Expose
    private Boolean departureEnabled;
    
    @SerializedName("distanceFromStop")
    @Expose
    private Double distanceFromStop;
    
    @SerializedName("frequency")
    @Expose
    private Frequency frequency;
    
    @SerializedName("lastUpdateTime")
    @Expose
    private Long lastUpdateTime;
    
    @SerializedName("numberOfStopsAway")
    @Expose
    private Integer numberOfStopsAway;
    
    @SerializedName("predicted")
    @Expose
    private Boolean predicted;
    
    @SerializedName("predictedArrivalInterval")
    @Expose
    private TimeInterval predictedArrivalInterval;
    
    @SerializedName("predictedArrivalTime")
    @Expose
    private Long predictedArrivalTime;
    
    @SerializedName("predictedDepartureInterval")
    @Expose
    private TimeInterval predictedDepartureInterval;
    
    @SerializedName("predictedDepartureTime")
    @Expose
    private Long predictedDepartureTime;
    
    @SerializedName("routeId")
    @Expose
    private String routeId;
    
    @SerializedName("routeLongName")
    @Expose
    private String routeLongName;
    
    @SerializedName("routeShortName")
    @Expose
    private String routeShortName;
    
    @SerializedName("scheduledArrivalInterval")
    @Expose
    private TimeInterval scheduledArrivalInterval;
    
    @SerializedName("scheduledArrivalTime")
    @Expose
    private Long scheduledArrivalTime;
    
    @SerializedName("scheduledDepartureInterval")
    @Expose
    private TimeInterval scheduledDepartureInterval;
    
    @SerializedName("scheduledDepartureTime")
    @Expose
    private Long scheduledDepartureTime;
    
    @SerializedName("serviceDate")
    @Expose
    private Long serviceDate;
    
    @SerializedName("situationIds")
    @Expose
    private List<String> situationIds;
    
    @SerializedName("status")
    @Expose
    private String status;
    
    @SerializedName("stopId")
    @Expose
    private String stopId;
    
    @SerializedName("stopSequence")
    @Expose
    private Integer stopSequence;
    
    @SerializedName("tripHeadsign")
    @Expose
    private String tripHeadsign;
    
    @SerializedName("tripId")
    @Expose
    private String tripId;
    
    @SerializedName("tripStatus")
    @Expose
    private TripStatus tripStatus;
    
    @SerializedName("vehicleId")
    @Expose
    private String vehicleId;
    

    public Boolean getArrivalEnabled() {
        return arrivalEnabled;
    }

    public void setArrivalEnabled(Boolean arrivalEnabled) {
        this.arrivalEnabled = arrivalEnabled;
    }

    public Integer getBlockTripSequence() {
        return blockTripSequence;
    }

    public void setBlockTripSequence(Integer blockTripSequence) {
        this.blockTripSequence = blockTripSequence;
    }

    public Boolean getDepartureEnabled() {
        return departureEnabled;
    }

    public void setDepartureEnabled(Boolean departureEnabled) {
        this.departureEnabled = departureEnabled;
    }

    public Double getDistanceFromStop() {
        return distanceFromStop;
    }

    public void setDistanceFromStop(Double distanceFromStop) {
        this.distanceFromStop = distanceFromStop;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getNumberOfStopsAway() {
        return numberOfStopsAway;
    }

    public void setNumberOfStopsAway(Integer numberOfStopsAway) {
        this.numberOfStopsAway = numberOfStopsAway;
    }

    public Boolean getPredicted() {
        return predicted;
    }

    public void setPredicted(Boolean predicted) {
        this.predicted = predicted;
    }

    public TimeInterval getPredictedArrivalInterval() {
        return predictedArrivalInterval;
    }

    public void setPredictedArrivalInterval(TimeInterval predictedArrivalInterval) {
        this.predictedArrivalInterval = predictedArrivalInterval;
    }

    public Long getPredictedArrivalTime() {
        return predictedArrivalTime;
    }

    public void setPredictedArrivalTime(Long predictedArrivalTime) {
        this.predictedArrivalTime = predictedArrivalTime;
    }

    public TimeInterval getPredictedDepartureInterval() {
        return predictedDepartureInterval;
    }

    public void setPredictedDepartureInterval(TimeInterval predictedDepartureInterval) {
        this.predictedDepartureInterval = predictedDepartureInterval;
    }

    public Long getPredictedDepartureTime() {
        return predictedDepartureTime;
    }

    public void setPredictedDepartureTime(Long predictedDepartureTime) {
        this.predictedDepartureTime = predictedDepartureTime;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteLongName() {
        return routeLongName;
    }

    public void setRouteLongName(String routeLongName) {
        this.routeLongName = routeLongName;
    }

    public String getRouteShortName() {
        return routeShortName;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public TimeInterval getScheduledArrivalInterval() {
        return scheduledArrivalInterval;
    }

    public void setScheduledArrivalInterval(TimeInterval scheduledArrivalInterval) {
        this.scheduledArrivalInterval = scheduledArrivalInterval;
    }

    public Long getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    public void setScheduledArrivalTime(Long scheduledArrivalTime) {
        this.scheduledArrivalTime = scheduledArrivalTime;
    }

    public TimeInterval getScheduledDepartureInterval() {
        return scheduledDepartureInterval;
    }

    public void setScheduledDepartureInterval(TimeInterval scheduledDepartureInterval) {
        this.scheduledDepartureInterval = scheduledDepartureInterval;
    }

    public Long getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    public void setScheduledDepartureTime(Long scheduledDepartureTime) {
        this.scheduledDepartureTime = scheduledDepartureTime;
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

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public Integer getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
    }

    public String getTripHeadsign() {
        return tripHeadsign;
    }

    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    
    
}
