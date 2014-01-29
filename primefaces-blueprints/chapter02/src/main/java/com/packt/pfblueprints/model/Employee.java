package com.packt.pfblueprints.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstname;

	private String lastname;

	private Date dob;

	private String sex;

	private String maritalStatus;
	

	private String address;

	private String country;

	private String city;

	

	private String postalCode;

	private String phone;

	private String email;
	

	private String university;

	private List<String> qualification=new ArrayList<String>();

	private String percentage;
	

	private String profession;

	private Double experience;

	private String company;

	private double currentPack;

	private double expectedPack;

	private Date joinedDate;
	

	private List<String> selectedFrameworks=new ArrayList<String>(); // checkbox menu

	private List<String> allFrameworks=new ArrayList<String>();

	private List<String> selectedDBs=new ArrayList<String>();// manycheckbox

	private List<String> allDBs=new ArrayList<String>();

	private List<String> selectedIDEs=new ArrayList<String>();

	private List<String> allIDEs=new ArrayList<String>();

	private List<String> selectedServers=new ArrayList<String>();

	private List<String> allServers=new ArrayList<String>();

	private String rating;

	private String info;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Double getExperience() {
		return experience;
	}

	public void setExperience(Double experience) {
		this.experience = experience;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCurrentPack() {
		return currentPack;
	}

	public void setCurrentPack(double currentPack) {
		this.currentPack = currentPack;
	}

	public double getExpectedPack() {
		return expectedPack;
	}

	public void setExpectedPack(double expectedPack) {
		this.expectedPack = expectedPack;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	

	public List<String> getQualification() {
		return qualification;
	}

	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public List<String> getSelectedFrameworks() {
		return selectedFrameworks;
	}

	public void setSelectedFrameworks(List<String> selectedFrameworks) {
		this.selectedFrameworks = selectedFrameworks;
	}

	

	public List<String> getAllFrameworks() {
		return allFrameworks;
	}

	public void setAllFrameworks(List<String> allFrameworks) {
		this.allFrameworks = allFrameworks;
	}

	public List<String> getSelectedDBs() {
		return selectedDBs;
	}

	public void setSelectedDBs(List<String> selectedDBs) {
		this.selectedDBs = selectedDBs;
	}

	public List<String> getAllDBs() {
		return allDBs;
	}

	public void setAllDBs(List<String> allDBs) {
		this.allDBs = allDBs;
	}

	public List<String> getSelectedIDEs() {
		return selectedIDEs;
	}

	public void setSelectedIDEs(List<String> selectedIDEs) {
		this.selectedIDEs = selectedIDEs;
	}

	public List<String> getAllIDEs() {
		return allIDEs;
	}

	public void setAllIDEs(List<String> allIDEs) {
		this.allIDEs = allIDEs;
	}

	public List<String> getSelectedServers() {
		return selectedServers;
	}

	public void setSelectedServers(List<String> selectedServers) {
		this.selectedServers = selectedServers;
	}

	public List<String> getAllServers() {
		return allServers;
	}

	public void setAllServers(List<String> allServers) {
		this.allServers = allServers;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}