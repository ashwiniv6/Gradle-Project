package com.example.demogradle.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Department {

    @Id
    //ToGenerate the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    //Validations are added
    @JsonIgnore
    @NotBlank(message = "Please Add Department Name")
    @NotNull
    @Length(max=5,min=1)
    @Size(max=10,min=0)
    private String departmentName;

    //Validations are added
    @JsonIgnore
    @NotBlank(message = "Please Add Address")
    @NotNull
    @Length(max=50,min=1)
    @Size(max=10,min=0)
    private String departmentAddress;

    //Validations are added
    @JsonIgnore
    @NotBlank(message = "Please Add Department Code")
    @NotNull
    @Length(max=5,min=1)
    @Size(max=10,min=0)
    private String departmentCode;

    //Getters and Setters for all the fields
    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    //Create Constructor for the fields
    public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    //Default Constructor
    public Department(){

    }

    //Create toString method for all the fields
    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

}
