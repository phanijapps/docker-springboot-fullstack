package com.perficient.spring.fullstack.springemployeefullstack.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offices")
public class Offices{

    @Id
    @Column(name = "officeCode", columnDefinition = "varchar")
    private String officeCode;
    @Column(name = "city", columnDefinition = "varchar")
    private String city;
    @Column(name = "phone", columnDefinition = "varchar")
    private String phone;
    @Column(name = "addressLine1", columnDefinition = "varchar")
    private String addressLine1;
    @Column(name = "addressLine2", columnDefinition = "varchar")
    private String addressLine2;
    @Column(name = "state", columnDefinition = "varchar")
    private String state;
    @Column(name = "country", columnDefinition = "varchar")
    private String country;
    @Column(name = "postalCode", columnDefinition = "varchar")
    private String postalCode;
    @Column(name = "territory", columnDefinition = "varchar")
	private String territory;

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

}