package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class VehicleJourney {

    @SerializedName("lineId")
    @Expose
    private String lineId;
    
    @SerializedName("direction")
    @Expose
    private String direction;
    
    @SerializedName("calls")
    @Expose
    private List<Call> calls;

    
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }
  
}
