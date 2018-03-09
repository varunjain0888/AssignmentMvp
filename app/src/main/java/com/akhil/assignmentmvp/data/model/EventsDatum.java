
package com.akhil.assignmentmvp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventsDatum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("can_check_out")
    @Expose
    private Boolean canCheckOut;
    @SerializedName("checked_out_at")
    @Expose
    private String checkedOutAt;
    @SerializedName("event")
    @Expose
    private Event event;

    public String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getCanCheckOut() {
        return canCheckOut;
    }

    public void setCanCheckOut(Boolean canCheckOut) {
        this.canCheckOut = canCheckOut;
    }

    public String getCheckedOutAt() {
        return checkedOutAt;
    }

    public void setCheckedOutAt(String checkedOutAt) {
        this.checkedOutAt = checkedOutAt;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

}
