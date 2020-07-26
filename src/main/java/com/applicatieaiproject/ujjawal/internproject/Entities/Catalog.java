package com.applicatieaiproject.ujjawal.internproject.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Catalog {
    @Id
    public int skuCode;
    public String skuName;
    public String skuDescription;
    public String brandName;
    public String brandDescription;

    @OneToOne(fetch = FetchType.EAGER)
    public Supplier supplier;



    public int getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(int skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDescription() {
        return skuDescription;
    }

    public void setSkuDescription(String skuDescription) {
        this.skuDescription = skuDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescription() {
        return brandDescription;
    }

    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "skuCode=" + skuCode +
                ", skuName='" + skuName + '\'' +
                ", skuDescription='" + skuDescription + '\'' +
                ", brandName='" + brandName + '\'' +
                ", brandDescription='" + brandDescription + '\'' +
                ", supplier=" + supplier.toString() +
                '}';
    }
}
