package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;
import java.util.Date;

public class User {
    public int id;
    public String name;
    public String email;
    public String phone;
    public Object details;
    public ArrayList<String> role;
    public ArrayList<String> privilage;
    public String permission;
    public Object sessionId;
    public String image;
    public String status;
    public String pushId;
    public String pushOs;
    public Date createdAt;
    public int logout;
    public Object basicprofile;
    public Object student;
    public Object guardian;
    public Userlogin userlogin;
    public String orgId;
    public String logo;
    public ArrayList<String> services;
    public ArrayList<String> access;
    public boolean allowMobileLogin;
    public Org org;
    public String kycStatus;
}
