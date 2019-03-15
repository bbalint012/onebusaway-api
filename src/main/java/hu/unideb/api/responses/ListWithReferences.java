package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ListWithReferences<T> {

    @SerializedName("references")
    @Expose
    private References references;

    @SerializedName("list")
    @Expose
    private List<T> list;

    public References getReferences() {
        return references;
    }

    public void setReferences(References references) {
        this.references = references;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
