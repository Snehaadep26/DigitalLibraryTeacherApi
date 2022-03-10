package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Standard {
    public int id;
    public String std;
    public String section;
    public String stream;
    public String courseName;
    public Date updatedAt;
}
