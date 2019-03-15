package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Consequences {

    @SerializedName("consequence")
    @Expose
    private Consequence consequence;

    
    public Consequence getConsequence() {
        return consequence;
    }

    public void setConsequence(Consequence consequence) {
        this.consequence = consequence;
    }
    
}
