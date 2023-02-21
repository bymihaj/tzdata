package com.bymihaj.tzdata;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="record")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name="REG_ADDR_KOATUU")
    private String koatuu;
    
    private String operCode;
    private String operName;
    
    @Column(name="D_REG")
    private Date dreg;
    
    private String depCode;
    private String dep;
    private String brand;
    private String model;
    private String vin;
    private String makeYear;
    private String color;
    private String kind;
    private String body;
    private String fuel;
    private String capacity;
    private String ownWeight;
    private String totalWeight;
    
    @Column(name="N_REG_NEW")
    private String regNew;
    
    public String getKoatuu() {
        return koatuu;
    }
    public void setKoatuu(String koatuu) {
        this.koatuu = koatuu;
    }
    public String getOperCode() {
        return operCode;
    }
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }
    public String getOperName() {
        return operName;
    }
    public void setOperName(String operName) {
        this.operName = operName;
    }
    public Date getDreg() {
        return dreg;
    }
    public void setDreg(Date dreg) {
        this.dreg = dreg;
    }
    public String getDepCode() {
        return depCode;
    }
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }
    public String getDep() {
        return dep;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getMakeYear() {
        return makeYear;
    }
    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getOwnWeight() {
        return ownWeight;
    }
    public void setOwnWeight(String ownWeight) {
        this.ownWeight = ownWeight;
    }
    public String getTotalWeight() {
        return totalWeight;
    }
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }
    public String getRegNew() {
        return regNew;
    }
    public void setRegNew(String regNew) {
        this.regNew = regNew;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
}
