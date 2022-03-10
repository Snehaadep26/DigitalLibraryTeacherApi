package com.example.digitallibraryteacherapi.DLTeacherApi;

import java.util.ArrayList;

public class Org {
    public String _id;
    public String id;
    public String instituteId;
    public String name;
    public String orgType;
    public String website;
    public String contactName;
    public String contactPhone;
    public String contactEmail;
    public String logo;
    public String url;
    public String address;
    public String country;
    public ArrayList<Service> services;
    public ArrayList<LiveClass> liveClass;
    public int dlStorage;
    public String status;
    public String fcmKey;
    public String gstin;
    public BankDetails bankDetails;
    public AccountHolder accountHolder;
    public String kycStatus;
    public String kycSubmittedOn;
    public String kycApprovedOn;
    public String kycRejectedOn;
    public String kycRejectedComments;
    public ArrayList<RejectedKycDoc> rejectedKycDocs;
    public ArrayList<ApprovedKycDoc> approvedKycDocs;
    public Settings settings;
    public boolean videoPremiumFeature;
}
