package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trip {

    @SerializedName("blockId")
    @Expose
    private String blockId;
    
    @SerializedName("directionId")
    @Expose
    private String directionId;
    
    @SerializedName("id")
    @Expose
    private String id;
    
    @SerializedName("routeId")
    @Expose
    private String routeId;
    
    @SerializedName("routeShortName")
    @Expose
    private String routeShortName;
    
    @SerializedName("serviceId")
    @Expose
    private String serviceId;
    
    @SerializedName("shapeId")
    @Expose
    private String shapeId;
    
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    
    @SerializedName("tripHeadsign")
    @Expose
    private String tripHeadsign;
    
    @SerializedName("tripShortName")
    @Expose
    private String tripShortName;

    
    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getDirectionId() {
        return directionId;
    }

    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteShortName() {
        return routeShortName;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTripHeadsign() {
        return tripHeadsign;
    }

    public void setTripHeadsign(String tripHeadsign) {
        this.tripHeadsign = tripHeadsign;
    }

    public String getTripShortName() {
        return tripShortName;
    }

    public void setTripShortName(String tripShortName) {
        this.tripShortName = tripShortName;
    }
    
    
    
}
