package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
//import org.primefaces.context.RequestContext;
import javax.faces.bean.ManagedBean;

import com.packt.pfblueprints.dao.LoginDAO;


@ManagedBean
@ViewScoped
public class LoginController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String newpassword;
	
	private String userrole;
	private String loginmessage;
	ResourceBundle messageBundle;
	
	@PostConstruct  
	public void init() { 
	
	}
	
	public String validateUser() throws SQLException {
		FacesMessage msg = null;
		boolean isValidUser=false;
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
			return "/views/admin?faces-redirect=true";	
		}
		
		LoginDAO dao=new LoginDAO();
		 isValidUser=dao.validateUser(username, password);
		
		if(isValidUser) {
			return "/views/jobposts?faces-redirect=true";
		}
		else {
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			 return null;
		}
		
	}
	
	public void changeUserRole(){
		
		if(userrole.equalsIgnoreCase("1")){
			loginmessage=messageBundle.getString("login.employerlogin");

		}
		else if(userrole.equalsIgnoreCase("2")){
			loginmessage=messageBundle.getString("login.adminlogin");

		}
		else {
			loginmessage=messageBundle.getString("login.jobseekerlogin");

		}
		
	}
	public void changepassword() throws SQLException{
		LoginDAO dao=new LoginDAO();
		boolean confirm=false;
		confirm=dao.changepassword(username, password, newpassword);
		
		if (confirm) {
			FacesMessage msg = new FacesMessage("change password is successful");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			FacesMessage msg = new FacesMessage("change password is unsuccessful",
					"Please try with valid data");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	
	

	public String getLoginmessage() {
		return loginmessage;
	}

	public void setLoginmessage(String loginmessage) {
		this.loginmessage = loginmessage;
	}

	
}