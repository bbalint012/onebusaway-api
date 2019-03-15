package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ExtendedReferences {
    
    @SerializedName("agencies")
    @Expose
    private List<Agency> agencies;

    @SerializedName("routes")
    @Expose
    private List<Route> routes;

    @SerializedName("situations")
    @Expose
    private List<Situation> situations;

    @SerializedName("stops")
    @Expose
    private List<Stop> stops;

    @SerializedName("trips")
    @Expose
    private List<Trip> trips;
    

    public List<Agency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public List<Situation> getSituations() {
        return situations;
    }

    public void setSituations(List<Situation> situations) {
        this.situations = situations;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }
    
}
