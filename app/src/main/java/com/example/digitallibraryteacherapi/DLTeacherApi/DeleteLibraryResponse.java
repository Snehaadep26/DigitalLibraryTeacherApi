package com.example.digitallibraryteacherapi.DLTeacherApi;

public class DeleteLibraryResponse {
    public ShowDelLib show;

    public DeleteLibraryResponse(ShowDelLib show) {
        this.show = show;
    }

    public ShowDelLib getShow() {
        return show;
    }
}

