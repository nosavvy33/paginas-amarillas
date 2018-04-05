package com.undead.nosavvy.paginasamarillas.models;

/**
 * Created by nosavvy on 4/5/18.
 */

public class Business {
/*
name
address
number
image
tag for improving searchs
 */

private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Business(String name, String address, String logo, String tag, String number, String description) {
        this.name = name;
        this.address = address;
        this.logo = logo;
        this.tag = tag;
        this.number = number;
        this.description = description;
    }

    private String address;
private String logo;
private String tag;
private String number;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;



}
