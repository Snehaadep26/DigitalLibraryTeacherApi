package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;
import java.util.Date;

public class PostSignInStudentResponse {
    public ShowStudent show;
    public Data data;

    public PostSignInStudentResponse(ShowStudent show, Data data) {
        this.show = show;
        this.data = data;
    }

    public ShowStudent getShow() {
        return show;
    }

    public Data getData() {
        return data;
    }
}


