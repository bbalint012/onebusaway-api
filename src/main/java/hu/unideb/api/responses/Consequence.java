package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Consequence {

    @SerializedName("condition")
    @Expose
    private String condition;
    
    @SerializedName("conditionDetails")
    @Expose
    private ConditionDetails conditionDetails;

    
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ConditionDetails getConditionDetails() {
        return conditionDetails;
    }

    public void setConditionDetails(ConditionDetails conditionDetails) {
        this.conditionDetails = conditionDetails;
    }
    
}
