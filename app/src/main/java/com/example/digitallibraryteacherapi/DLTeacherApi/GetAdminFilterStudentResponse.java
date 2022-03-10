package com.example.digitallibraryteacherapi.DLTeacherApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class GetAdminFilterStudentResponse {
    public String month;
    public int engagementCountStudent;
    public int impressionCountStudent;

    public GetAdminFilterStudentResponse(String month, int engagementCountStudent, int impressionCountStudent) {
        this.month = month;
        this.engagementCountStudent = engagementCountStudent;
        this.impressionCountStudent = impressionCountStudent;
    }

    public String getMonth() {
        return month;
    }

    public int getEngagementCountStudent() {
        return engagementCountStudent;
    }

    public int getImpressionCountStudent() {
        return impressionCountStudent;
    }
}

