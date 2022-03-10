package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;
import java.util.Date;

public class PostSignInAdminResponse {
    public ShowAdmin show;
    public Data data;

    public PostSignInAdminResponse(ShowAdmin show, Data data) {
        this.show = show;
        this.data = data;
    }

    public ShowAdmin getShow() {
        return show;
    }

    public Data getData() {
        return data;
    }
}

