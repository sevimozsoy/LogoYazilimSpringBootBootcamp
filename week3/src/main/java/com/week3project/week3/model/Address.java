package com.week3project.week3.model;

public class Address {
    private String country;
    private String province;
    private String address;

    public Address(String country, String province, String address) {
        this.country = country;
        this.province = province;
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
