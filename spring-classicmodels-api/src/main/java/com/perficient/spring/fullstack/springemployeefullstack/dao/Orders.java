package com.perficient.spring.fullstack.springemployeefullstack.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders{

    @Id
    @Column(name = "orderNumber", columnDefinition = "int")
    private int orderNumber;
    @Column(name = "orderDate", columnDefinition = "date")
    private java.util.Date orderDate;
    @Column(name = "requiredDate", columnDefinition = "date")
    private java.util.Date requiredDate;
    @Column(name = "shippedDate", columnDefinition = "date")
    private java.util.Date shippedDate;
    @Column(name = "status", columnDefinition = "varchar")
    private String status;
    @Column(name = "customerNumber", columnDefinition = "int")
    private int customerNumber;
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + customerNumber;
        result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
        result = prime * result + orderNumber;
        result = prime * result + ((requiredDate == null) ? 0 : requiredDate.hashCode());
        result = prime * result + ((shippedDate == null) ? 0 : shippedDate.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Orders other = (Orders) obj;
        if (customerNumber != other.customerNumber)
            return false;
        if (orderDate == null) {
            if (other.orderDate != null)
                return false;
        } else if (!orderDate.equals(other.orderDate))
            return false;
        if (orderNumber != other.orderNumber)
            return false;
        if (requiredDate == null) {
            if (other.requiredDate != null)
                return false;
        } else if (!requiredDate.equals(other.requiredDate))
            return false;
        if (shippedDate == null) {
            if (other.shippedDate != null)
                return false;
        } else if (!shippedDate.equals(other.shippedDate))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public java.util.Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.util.Date orderDate) {
        this.orderDate = orderDate;
    }

    public java.util.Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(java.util.Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public java.util.Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(java.util.Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }


}