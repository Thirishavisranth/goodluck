package com.example.demo;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity

@Table(name="Donor_Details")



public class donorEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Id")
	private int id;
	
	@Column(name="Donor_Name")
	private String name;
	
	@Column(name="Donor_Age")
	private int age;
	
	@Column(name="Donor_Gender")
	private String gender;
	
	
	@Column(name="Donor_BloodGroup")
	private String bloodgroup;
	
	@Column(name="Donor_MobileNo")
	private long mobile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	
	public donorEntity() {
		
	}
	
	public donorEntity(int id,String name,int age,String gender,String bloodgroup,long mobile) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.bloodgroup=bloodgroup;
		this.mobile=mobile;
	}
	
	
	
	

}
