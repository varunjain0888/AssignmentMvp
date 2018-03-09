
package com.akhil.assignmentmvp.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("all_day")
    @Expose
    private Boolean allDay;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("attending_status")
    @Expose
    private Object attendingStatus;
    @SerializedName("friends_attending")
    @Expose
    private Boolean friendsAttending;
    @SerializedName("attendings_count")
    @Expose
    private Integer attendingsCount;
    @SerializedName("place")
    @Expose
    private Place place;
    @SerializedName("is_ticket_event")
    @Expose
    private Boolean isTicketEvent;
    @SerializedName("number_of_tickets_purchased")
    @Expose
    private Integer numberOfTicketsPurchased;
    @SerializedName("ticket_min_price")
    @Expose
    private Integer ticketMinPrice;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("cancelled")
    @Expose
    private Boolean cancelled;
    @SerializedName("has_all_tickets_refunded")
    @Expose
    private Boolean hasAllTicketsRefunded;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("done")
    @Expose
    private Object done;
    @SerializedName("done_at")
    @Expose
    private Object doneAt;
    @SerializedName("is_default_image")
    @Expose
    private Boolean isDefaultImage;
    @SerializedName("is_class_event")
    @Expose
    private Boolean isClassEvent;
    @SerializedName("is_involvio_personal_event")
    @Expose
    private Boolean isInvolvioPersonalEvent;
    @SerializedName("recurrence_rule")
    @Expose
    private Object recurrenceRule;

    public String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getAllDay() {
        return allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Object getAttendingStatus() {
        return attendingStatus;
    }

    public void setAttendingStatus(Object attendingStatus) {
        this.attendingStatus = attendingStatus;
    }

    public Boolean getFriendsAttending() {
        return friendsAttending;
    }

    public void setFriendsAttending(Boolean friendsAttending) {
        this.friendsAttending = friendsAttending;
    }

    public Integer getAttendingsCount() {
        return attendingsCount;
    }

    public void setAttendingsCount(Integer attendingsCount) {
        this.attendingsCount = attendingsCount;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Boolean getIsTicketEvent() {
        return isTicketEvent;
    }

    public void setIsTicketEvent(Boolean isTicketEvent) {
        this.isTicketEvent = isTicketEvent;
    }

    public Integer getNumberOfTicketsPurchased() {
        return numberOfTicketsPurchased;
    }

    public void setNumberOfTicketsPurchased(Integer numberOfTicketsPurchased) {
        this.numberOfTicketsPurchased = numberOfTicketsPurchased;
    }

    public Integer getTicketMinPrice() {
        return ticketMinPrice;
    }

    public void setTicketMinPrice(Integer ticketMinPrice) {
        this.ticketMinPrice = ticketMinPrice;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Boolean getHasAllTicketsRefunded() {
        return hasAllTicketsRefunded;
    }

    public void setHasAllTicketsRefunded(Boolean hasAllTicketsRefunded) {
        this.hasAllTicketsRefunded = hasAllTicketsRefunded;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getDone() {
        return done;
    }

    public void setDone(Object done) {
        this.done = done;
    }

    public Object getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(Object doneAt) {
        this.doneAt = doneAt;
    }

    public Boolean getIsDefaultImage() {
        return isDefaultImage;
    }

    public void setIsDefaultImage(Boolean isDefaultImage) {
        this.isDefaultImage = isDefaultImage;
    }

    public Boolean getIsClassEvent() {
        return isClassEvent;
    }

    public void setIsClassEvent(Boolean isClassEvent) {
        this.isClassEvent = isClassEvent;
    }

    public Boolean getIsInvolvioPersonalEvent() {
        return isInvolvioPersonalEvent;
    }

    public void setIsInvolvioPersonalEvent(Boolean isInvolvioPersonalEvent) {
        this.isInvolvioPersonalEvent = isInvolvioPersonalEvent;
    }

    public Object getRecurrenceRule() {
        return recurrenceRule;
    }

    public void setRecurrenceRule(Object recurrenceRule) {
        this.recurrenceRule = recurrenceRule;
    }

}
