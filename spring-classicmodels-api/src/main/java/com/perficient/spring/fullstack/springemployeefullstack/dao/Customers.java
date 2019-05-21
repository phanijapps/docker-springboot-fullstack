package com.perficient.spring.fullstack.springemployeefullstack.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Customers")
@Table(name="customers")
public class Customers{

    @Id
    @Column(name = "customerNumber")
    private int customerNumber;
    @Column(name = "customerName", columnDefinition = "varchar")
    private String customerName;
    @Column(name = "contactLastName", columnDefinition = "varchar")
    private String contactLastName;    
    @Column(name = "contactFirstName", columnDefinition = "varchar")
    private String contactFirstName;    
    @Column(name = "phone", columnDefinition = "varchar")
    private String phone;    
    @Column(name = "addressLine1", columnDefinition = "varchar")
    private String addressLine1;
    @Column(name = "addressLine2", columnDefinition = "varchar")
    private String addressLine2;
    @Column(name = "city", columnDefinition = "varchar")
    private String city;
    @Column(name = "state", columnDefinition = "varchar")
    private String state;
    @Column(name = "postalCode", columnDefinition = "varchar")
    private String postalCode;
    @Column(name = "country", columnDefinition = "varchar")
    private String country;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "salesRepEmployeeNumber")
    private Employees salesRepEmployeeNumber;    
    
    @Column(name = "creditLimit", columnDefinition = "decimal")
    private double creditLimit;

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employees getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(Employees salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    

}