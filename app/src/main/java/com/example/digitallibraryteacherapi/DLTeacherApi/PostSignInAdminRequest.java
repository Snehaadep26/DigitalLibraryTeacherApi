package com.example.digitallibraryteacherapi.DLTeacherApi;


public class PostSignInAdminRequest {
    public String email;
    public String password;
    public boolean isWebLogin;

    public PostSignInAdminRequest(String email, String password, boolean isWebLogin) {
        this.email = email;
        this.password = password;
        this.isWebLogin = isWebLogin;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isWebLogin() {
        return isWebLogin;
    }
}

