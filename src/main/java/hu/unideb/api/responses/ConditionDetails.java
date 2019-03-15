package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ConditionDetails {

    @SerializedName("diversionPath")
    @Expose
    private DiversionPath diversionPath;
    
    @SerializedName("diversionStopIds")
    @Expose
    private List<String> diversionStopIds;

    
    public DiversionPath getDiversionPath() {
        return diversionPath;
    }

    public void setDiversionPath(DiversionPath diversionPath) {
        this.diversionPath = diversionPath;
    }

    public List<String> getDiversionStopIds() {
        return diversionStopIds;
    }

    public void setDiversionStopIds(List<String> diversionStopIds) {
        this.diversionStopIds = diversionStopIds;
    }
    
    
}
