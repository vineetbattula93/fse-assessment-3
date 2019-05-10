package com.vineet.assessment3.model;

public class UserEvent {

    private String type;
    private String userId;
    private long timestamp;
    private String context;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }




}

