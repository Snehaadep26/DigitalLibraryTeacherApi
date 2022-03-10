package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;
import java.util.Date;

public class GetChapterFilterAdminResponse {
    public int id;
    public String name;
    public boolean status;
    public boolean deleted;
    public Date updatedAt;
    public Date createdAt;
    public Subject subject;

    public GetChapterFilterAdminResponse(int id, String name, boolean status, boolean deleted, Date updatedAt, Date createdAt, Subject subject) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deleted = deleted;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Subject getSubject() {
        return subject;
    }
}

