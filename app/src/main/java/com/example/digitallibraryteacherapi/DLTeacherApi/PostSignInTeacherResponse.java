package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;
import java.util.Date;

public class PostSignInTeacherResponse {
    public ShowTeacher show;
    public Data data;

    public PostSignInTeacherResponse(ShowTeacher show, Data data) {
        this.show = show;
        this.data = data;
    }

    public ShowTeacher getShow() {
        return show;
    }

    public Data getData() {
        return data;
    }
}

