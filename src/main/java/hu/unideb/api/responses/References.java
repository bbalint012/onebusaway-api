package hu.unideb.api.responses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class References {

    @SerializedName("agencies")
    @Expose
    private List<Agency> agencies;
    
    public void setAgencies(List<Agency> agencies) {
        this.agencies = agencies;
    }

    public List<Agency> getAgencies() {
        return agencies;
    }  

}
