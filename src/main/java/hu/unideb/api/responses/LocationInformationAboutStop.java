package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LocationInformationAboutStop {     //'list' in response

    @SerializedName("code")
    @Expose
    private String code;
    
    @SerializedName("direction")
    @Expose
    private String direction;
    
    @SerializedName("id")
    @Expose
    private String id;
    
    @SerializedName("lat")
    @Expose
    private Double lat;
    
    @SerializedName("locationType")
    @Expose
    private Long locationType;
    
    @SerializedName("lon")
    @Expose
    private Double lon;
    
    @SerializedName("name")
    @Expose
    private String name;
    
    @SerializedName("routeIds")
    @Expose
    private List<String> routeIds;
    
    @SerializedName("wheelchairBoarding")
    @Expose
    private String wheelchairBoarding;

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Long getLocationType() {
        return locationType;
    }

    public void setLocationType(Long locationType) {
        this.locationType = locationType;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRouteIds() {
        return routeIds;
    }

    public void setRouteIds(List<String> routeIds) {
        this.routeIds = routeIds;
    }

    public String getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    public void setWheelchairBoarding(String wheelchairBoarding) {
        this.wheelchairBoarding = wheelchairBoarding;
    }
    
    
    
}
