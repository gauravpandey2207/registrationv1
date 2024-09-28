package com.api.model;

public class Monu {
    private String id;
    private String Name;
    private String Address;
    private String MobileNumber;
    private String Adhar;

    public Monu() {
    }

    public Monu(String id, String name, String address, String mobileNumber, String adhar) {
        this.id = id;
        Name = name;
        Address = address;
        MobileNumber = mobileNumber;
        Adhar = adhar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getAdhar() {
        return Adhar;
    }

    public void setAdhar(String adhar) {
        Adhar = adhar;
    }
}

