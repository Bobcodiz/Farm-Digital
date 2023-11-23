package com.farmdigital.nerddevs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class FarmerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String farmerName;
    private String county;
    private String farmsize;
    private String products;
    private LocalDateTime lastseen;

    public FarmerProfile() {
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getFarmsize() {
        return farmsize;
    }

    public void setFarmsize(String farmsize) {
        this.farmsize = farmsize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLastseen() {
        return lastseen;
    }

    public void setLastseen(LocalDateTime lastseen) {
        this.lastseen = lastseen;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }
}
