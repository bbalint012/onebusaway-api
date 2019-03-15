package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Polyline {

    @SerializedName("length")
    @Expose
    private Long length;
    
    @SerializedName("levels")
    @Expose
    private String levels;
    
    @SerializedName("points")
    @Expose
    private String points;

    
    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
    
}
