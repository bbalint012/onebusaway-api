package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Affects {

    @SerializedName("vehicleJourneys")
    @Expose
    private List<VehicleJourney> vehicleJourneys;

    
    public List<VehicleJourney> getVehicleJourneys() {
        return vehicleJourneys;
    }

    public void setVehicleJourneys(List<VehicleJourney> vehicleJourneys) {
        this.vehicleJourneys = vehicleJourneys;
    }
  
}
