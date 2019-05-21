package com.perficient.spring.fullstack.springemployeefullstack.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @Column(name = "productCode", columnDefinition = "varchar")
    private String productCode;
    @Column(name = "productName", columnDefinition = "varchar")
    private String productName;
    @Column(name = "productLine", columnDefinition = "varchar")
    private String productLine;
    @Column(name = "productScale", columnDefinition = "varchar")
    private String productScale;
    @Column(name = "productVendor", columnDefinition = "varchar")
    private String productVendor;
    @Column(name = "productDescription", columnDefinition = "text")
    private String productDescription;
    @Column(name = "quantityInStock", columnDefinition = "smallint")
    private int quantityInStock;
    @Column(name = "buyPrice", columnDefinition = "decimal")
    private double buyPrice;
    @Column(name = "msrp", columnDefinition = "decimal")
    private double mSRP;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getmSRP() {
        return mSRP;
    }

    public void setmSRP(double mSRP) {
        this.mSRP = mSRP;
    }

    


}
    
