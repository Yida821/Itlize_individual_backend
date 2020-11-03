package com.example.yichun.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String productName;

    @Column
    private String brand;

    //Subcate
    @Column
    private String subCategoryName;
    //Subcate


    //category
    @Column
    private String categoryName;
    //category

    //Technical specification
    @Column
    private int airFlow;

    @Column
    private int power;

    @Column
    private int operatingVoltage;

    @Column
    private int fanSpeed;
    //Technical specification

    //type
    @Column
    private String userType;

    @Column
    private String application;

    @Column
    private String mountingLocation;

    @Column
    private String accessories;

    @Column
    private String modelYear;
    //type

    //description
    @Column
    private String manufacturer;

    @Column
    private String series;

    @Column
    private String model;

    //description

    public Product() {
    }

    public Product(int id, String productName, String brand, String subCategoryName, String categoryName, int airFlow, int power, int operatingVoltage, int fanSpeed, String userType, String application, String mountingLocation, String accessories, String modelYear, String manufacturer, String series, String model) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.subCategoryName = subCategoryName;
        this.categoryName = categoryName;
        this.airFlow = airFlow;
        this.power = power;
        this.operatingVoltage = operatingVoltage;
        this.fanSpeed = fanSpeed;
        this.userType = userType;
        this.application = application;
        this.mountingLocation = mountingLocation;
        this.accessories = accessories;
        this.modelYear = modelYear;
        this.manufacturer = manufacturer;
        this.series = series;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getAirFlow() {
        return airFlow;
    }

    public void setAirFlow(int airFlow) {
        this.airFlow = airFlow;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getOperatingVoltage() {
        return operatingVoltage;
    }

    public void setOperatingVoltage(int operatingVoltage) {
        this.operatingVoltage = operatingVoltage;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMountingLocation() {
        return mountingLocation;
    }

    public void setMountingLocation(String mountingLocation) {
        this.mountingLocation = mountingLocation;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
