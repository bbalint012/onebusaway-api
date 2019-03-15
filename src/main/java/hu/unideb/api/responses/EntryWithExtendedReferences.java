package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryWithExtendedReferences<T> {

    @SerializedName("references")
    @Expose
    private ExtendedReferences references;

    @SerializedName("entry")
    @Expose
    private T entry;
    

    public ExtendedReferences getReferences() {
        return references;
    }

    public void setReferences(ExtendedReferences references) {
        this.references = references;
    }

    public T getEntry() {
        return entry;
    }

    public void setEntry(T entry) {
        this.entry = entry;
    }

}
