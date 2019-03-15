package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryWithReferences<T> {
    @SerializedName("references")
    @Expose
    private References references;

    @SerializedName("entry")
    @Expose
    private T entry;

    public References getReferences() {
        return references;
    }

    public void setReferences(References references) {
        this.references = references;
    }

    public T getEntry() {
        return entry;
    }

    public void setEntry(T entry) {
        this.entry = entry;
    }
    
    
}
