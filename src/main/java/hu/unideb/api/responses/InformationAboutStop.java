package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class InformationAboutStop {     // 'Entry' in response

    @SerializedName("arrivalsAndDepartures")
    @Expose
    private List<ArrivalsAndDeparture> arrivalsAndDepartures;
    
    @SerializedName("nearbyStopIds")
    @Expose
    private List<String> nearbyStopIds;
    
    @SerializedName("situationIds")
    @Expose
    private List<String> situationIds;
    
    @SerializedName("stopId")
    @Expose
    private String stopId;

    
    public List<ArrivalsAndDeparture> getArrivalsAndDepartures() {
        return arrivalsAndDepartures;
    }

    public void setArrivalsAndDepartures(List<ArrivalsAndDeparture> arrivalsAndDepartures) {
        this.arrivalsAndDepartures = arrivalsAndDepartures;
    }

    public List<String> getNearbyStopIds() {
        return nearbyStopIds;
    }

    public void setNearbyStopIds(List<String> nearbyStopIds) {
        this.nearbyStopIds = nearbyStopIds;
    }

    public List<String> getSituationIds() {
        return situationIds;
    }

    public void setSituationIds(List<String> situationIds) {
        this.situationIds = situationIds;
    }

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }
    
    
}
