package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Route {        //'Entry' in the response

    @SerializedName("agencyId")
    @Expose
    private String agencyId;
    
    @SerializedName("color")
    @Expose
    private String color;
    
    @SerializedName("description")
    @Expose
    private String description;
    
    @SerializedName("id")
    @Expose
    private String id;
    
    @SerializedName("longName")
    @Expose
    private String longName;
    
    @SerializedName("shortName")
    @Expose
    private String shortName;
    
    @SerializedName("textColor")
    @Expose
    private String textColor;
    
    @SerializedName("type")
    @Expose
    private Integer type;
    
    @SerializedName("url")
    @Expose
    private String url;

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
