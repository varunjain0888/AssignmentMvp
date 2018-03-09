
package com.akhil.assignmentmvp.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Place {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("bid")
    @Expose
    private String bid;
    @SerializedName("fb_id")
    @Expose
    private Object fbId;
    @SerializedName("loc")
    @Expose
    private List<String> loc = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("room_id")
    @Expose
    private Object roomId;
    @SerializedName("room_name")
    @Expose
    private String roomName;
    @SerializedName("address")
    @Expose
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Object getFbId() {
        return fbId;
    }

    public void setFbId(Object fbId) {
        this.fbId = fbId;
    }

    public List<String> getLoc() {
        return loc;
    }

    public void setLoc(List<String> loc) {
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRoomId() {
        return roomId;
    }

    public void setRoomId(Object roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
