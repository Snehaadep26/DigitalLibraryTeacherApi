package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class PostEngagementHistoryStudentRequest {
    public ArrayList<Integer> libraryIds;
    public String type;

    public PostEngagementHistoryStudentRequest(ArrayList<Integer> libraryIds, String type) {
        this.libraryIds = libraryIds;
        this.type = type;
    }

    public ArrayList<Integer> getLibraryIds() {
        return libraryIds;
    }

    public String getType() {
        return type;
    }
}

