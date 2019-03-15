package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeInterval {
    
    @SerializedName("from")
    @Expose
    private Long from;
    
    @SerializedName("to")
    @Expose
    private Long to;

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }
    
    
}
