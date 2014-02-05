package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.packt.pfblueprints.dao.AdminDAO;
import com.packt.pfblueprints.dao.JobPostsDAO;
import com.packt.pfblueprints.model.Employee;
@ManagedBean
@ViewScoped
public class AdminController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String aboutus;
    private String contactus;
    private String disclaimer;
    private List<Employee> employeelist;
    
    @SuppressWarnings("restriction")
	@PostConstruct  
	public void init() { 
		AdminDAO dao;
		try {
			dao = new AdminDAO();
			employeelist=dao.getEmployeeList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
    
	public String getAboutus() {
		return aboutus;
	}
	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}
	public String getContactus() {
		return contactus;
	}
	public void setContactus(String contactus) {
		this.contactus = contactus;
	}
	public String getDisclaimer() {
		return disclaimer;
	}
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public List<Employee> getEmployeelist() {
		return employeelist;
	}

	public void setEmployeelist(List<Employee> employeelist) {
		this.employeelist = employeelist;
	}
	
    
	
}