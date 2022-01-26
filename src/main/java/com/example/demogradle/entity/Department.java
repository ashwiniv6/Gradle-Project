package com.example.demogradle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    //ToGenerate the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    //Validations are added
    @NotBlank(message = "Please Add Department Name")
    //@NotNull
    @Length(max=5,min=1)
    @Size(max=10,min=0)
    private String departmentName;

    //Validations are added
    @NotBlank(message = "Please Add Address")
   // @NotNull
    @Length(max=50,min=1)
    @Size(max=10,min=0)
    private String departmentAddress;

    //Validations are added
    @NotBlank(message = "Please Add Department Code")
   // @NotNull
    @Length(max=5,min=1)
    @Size(max=10,min=0)
    private String departmentCode;


}
