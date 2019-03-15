package hu.unideb.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class BaseResponse<T> {
    
    @SerializedName("code")
    @Expose
    private Integer code;
    
    @SerializedName("currentTime")
    @Expose
    private Long currentTime;
    
    @SerializedName("text")
    @Expose
    private String text;
    
    @SerializedName("version")
    @Expose
    private Integer version;
    
    @SerializedName("data")
    @Expose
    private T data;
    
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    
}
