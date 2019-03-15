package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ListWithExtendedReferences<T> {

    @SerializedName("limitExceeded")
    @Expose
    private Boolean limitExceeded;
    
    @SerializedName("list")
    @Expose
    private List<T> list;
    
    @SerializedName("outOfRange")
    @Expose
    private Boolean outOfRange;
    
    @SerializedName("references")
    @Expose
    private ExtendedReferences references;

    
    public Boolean getLimitExceeded() {
        return limitExceeded;
    }

    public void setLimitExceeded(Boolean limitExceeded) {
        this.limitExceeded = limitExceeded;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> locationInformationAboutStop) {
        this.list = locationInformationAboutStop;
    }

    public Boolean getOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(Boolean outOfRange) {
        this.outOfRange = outOfRange;
    }

    public ExtendedReferences getReferences() {
        return references;
    }

    public void setReferences(ExtendedReferences references) {
        this.references = references;
    }
    
    
}
