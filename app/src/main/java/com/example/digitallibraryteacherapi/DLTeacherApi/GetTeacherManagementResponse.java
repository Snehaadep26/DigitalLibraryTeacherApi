package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class GetTeacherManagementResponse {
    public int id;
    public String name;
    public String email;
    public String phone;
    public String details;
    public ArrayList<String> role;
    public ArrayList<String> privilage;
    public String permission;
    public Object sessionId;
    public String image;
    public String status;
    public String pushId;
    public String pushOs;

    public GetTeacherManagementResponse(int id, String name, String email, String phone, String details, ArrayList<String> role, ArrayList<String> privilage, String permission, Object sessionId, String image, String status, String pushId, String pushOs) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.details = details;
        this.role = role;
        this.privilage = privilage;
        this.permission = permission;
        this.sessionId = sessionId;
        this.image = image;
        this.status = status;
        this.pushId = pushId;
        this.pushOs = pushOs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDetails() {
        return details;
    }

    public ArrayList<String> getRole() {
        return role;
    }

    public ArrayList<String> getPrivilage() {
        return privilage;
    }

    public String getPermission() {
        return permission;
    }

    public Object getSessionId() {
        return sessionId;
    }

    public String getImage() {
        return image;
    }

    public String getStatus() {
        return status;
    }

    public String getPushId() {
        return pushId;
    }

    public String getPushOs() {
        return pushOs;
    }
}


