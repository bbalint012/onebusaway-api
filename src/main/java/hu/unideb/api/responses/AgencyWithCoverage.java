package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AgencyWithCoverage {   // 'List' in the response.

    @SerializedName("agencyId")
    @Expose
    private String agencyId;
    
    @SerializedName("lat")
    @Expose
    private Double lat;
    
    @SerializedName("latSpan")
    @Expose
    private Double latSpan;
    
    @SerializedName("lon")
    @Expose
    private Double lon;
    
    @SerializedName("lonSpan")
    @Expose
    private Double lonSpan;

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLatSpan() {
        return latSpan;
    }

    public void setLatSpan(Double latSpan) {
        this.latSpan = latSpan;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLonSpan() {
        return lonSpan;
    }

    public void setLonSpan(Double lonSpan) {
        this.lonSpan = lonSpan;
    }
    
    

}
