package com.csi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	
	private String empName;
	
	private String empAddress;
	
	private long empContactNumber;
	
	private double empSalary;
	
	@JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/Kolkata")
	private Date empDOB;
	
	private String empEmailId;
	
	private String empPassword;
	
	
}
