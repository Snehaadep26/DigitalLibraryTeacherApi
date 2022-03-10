package com.example.digitallibraryteacherapi.DLTeacherApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class PostSignInTeacherRequest {
    public String email;
    public String password;
    public boolean isWebLogin;

    public PostSignInTeacherRequest(String email, String password, boolean isWebLogin) {
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

