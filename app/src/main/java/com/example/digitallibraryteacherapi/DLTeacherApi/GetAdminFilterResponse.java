package com.example.digitallibraryteacherapi.DLTeacherApi;


public class GetAdminFilterResponse {
    public String date;
    public String short_date;
    public String engagementCountTeacher;
    public String impressionCountTeacher;
    public String engagementCountStudent;
    public String impressionCountStudent;

    public GetAdminFilterResponse(String date, String short_date, String engagementCountTeacher, String impressionCountTeacher, String engagementCountStudent, String impressionCountStudent) {
        this.date = date;
        this.short_date = short_date;
        this.engagementCountTeacher = engagementCountTeacher;
        this.impressionCountTeacher = impressionCountTeacher;
        this.engagementCountStudent = engagementCountStudent;
        this.impressionCountStudent = impressionCountStudent;
    }

    public String getDate() {
        return date;
    }

    public String getShort_date() {
        return short_date;
    }

    public String getEngagementCountTeacher() {
        return engagementCountTeacher;
    }

    public String getImpressionCountTeacher() {
        return impressionCountTeacher;
    }

    public String getEngagementCountStudent() {
        return engagementCountStudent;
    }

    public String getImpressionCountStudent() {
        return impressionCountStudent;
    }
}

