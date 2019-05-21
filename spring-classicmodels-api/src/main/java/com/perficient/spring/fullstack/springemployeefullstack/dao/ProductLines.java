package com.perficient.spring.fullstack.springemployeefullstack.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productlines")
public class ProductLines{

    @Id
    @Column(name="productLine", columnDefinition = "varchar")
    private String productLine;
    @Column(name="textDescription", columnDefinition = "varchar")
    private String textDescription;
    @Column(name="image", columnDefinition = "mediumblob")
	private java.sql.Blob image;

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public java.sql.Blob getImage() {
        return image;
    }

    public void setImage(java.sql.Blob image) {
        this.image = image;
    }

	
}