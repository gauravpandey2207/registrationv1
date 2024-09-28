package com.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bharat_info")
public class CloudBharat {

    @Id
    private String BharatId;
    private String BharatName;
    private String BharatAddress;
    private String BharatMobileNumber;


    public CloudBharat() {
    }

    public CloudBharat(String bharatId, String bharatName, String bharatAddress, String bharatMobileNumber) {
        BharatId = bharatId;
        BharatName = bharatName;
        BharatAddress = bharatAddress;
        BharatMobileNumber = bharatMobileNumber;
    }

    public String getBharatId() {
        return BharatId;
    }

    public void setBharatId(String bharatId) {
        BharatId = bharatId;
    }

    public String getBharatName() {
        return BharatName;
    }

    public void setBharatName(String bharatName) {
        BharatName = bharatName;
    }

    public String getBharatAddress() {
        return BharatAddress;
    }

    public void setBharatAddress(String bharatAddress) {
        BharatAddress = bharatAddress;
    }

    public String getBharatMobileNumber() {
        return BharatMobileNumber;
    }

    public void setBharatMobileNumber(String bharatMobileNumber) {
        BharatMobileNumber = bharatMobileNumber;
    }
}