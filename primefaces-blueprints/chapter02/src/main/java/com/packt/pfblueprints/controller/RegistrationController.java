package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.annotation.PostConstruct;

import org.primefaces.event.FlowEvent;

import com.packt.pfblueprints.model.Employee;

@ManagedBean
@ViewScoped
public class RegistrationController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee = new Employee();

	private Map<String,String> countries=new HashMap<String,String>();
	private Map<String,Map<String,String>> citiesData=new HashMap<String, Map<String,String>>();
	private Map<String,String> cities=new HashMap<String,String>();
	
	private List<String> allFrameworks=new ArrayList<String>();

	private List<String> allDBs=new ArrayList<String>();

	private List<String> allIDEs=new ArrayList<String>();

	private List<String> allServers=new ArrayList<String>();

	private Boolean skip;
	
	@SuppressWarnings("restriction")
	@PostConstruct
	public void init(){
		    countries.put("UK", "UK");  
	        countries.put("US", "US");  
	        countries.put("India", "India"); 
	        countries.put("Germany", "Germany"); 
	          
	        Map<String,String> citiesUK = new HashMap<String, String>();  
	        citiesUK.put("London", "London");  
	        citiesUK.put("Bristol", "Bristol");  
	        citiesUK.put("Derby", "Derby");  
	          
	        Map<String,String> citiesUS = new HashMap<String, String>();  
	        citiesUS.put("Newyork", "Newyork");  
	        citiesUS.put("California", "California");  
	        citiesUS.put("Washington", "Washington");  
	          
	        Map<String,String> citiesIndia = new HashMap<String, String>();  
	        citiesIndia.put("Delhi", "Delhi");  
	        citiesIndia.put("Chennai", "Chennai");  
	        citiesIndia.put("Banglore", "Banglore"); 
	        
	        Map<String,String> citiesGermany= new HashMap<String, String>();  
	        citiesGermany.put("Berlin", "Berlin");  
	        citiesGermany.put("Hamburg", "Hamburg");  
	        citiesGermany.put("Bavaria", "Bavaria"); 
	          
	        citiesData.put("UK", citiesUK);  
	        citiesData.put("US", citiesUS);  
	        citiesData.put("India", citiesIndia);
	        citiesData.put("Germany", citiesGermany); 
	        
	        allFrameworks.add("JSF");
	        allFrameworks.add("Spring");
	        allFrameworks.add("Struts");
	        allFrameworks.add("Grails");
	        
	        allDBs.add("Oracle");
	        allDBs.add("MySQL");
	        allDBs.add("SQLServer");
	        allDBs.add("DB2");
	        
	        allIDEs.add("Eclipse");
	        allIDEs.add("NetBeans");
	        allIDEs.add("Intellij");
	        allIDEs.add("JDeveloper");
	        
	        allServers.add("WebSphere");
	        allServers.add("WebLogic");
	        allServers.add("Glassfish");
	        allServers.add("Jboss");
	        
	        
	        
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Boolean getSkip() {
		return skip;
	}

	public void setSkip(Boolean skip) {
		this.skip = skip;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}

	

	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

	public List<String> getAllFrameworks() {
		return allFrameworks;
	}

	public void setAllFrameworks(List<String> allFrameworks) {
		this.allFrameworks = allFrameworks;
	}

	public List<String> getAllDBs() {
		return allDBs;
	}

	public void setAllDBs(List<String> allDBs) {
		this.allDBs = allDBs;
	}

	public List<String> getAllIDEs() {
		return allIDEs;
	}

	public void setAllIDEs(List<String> allIDEs) {
		this.allIDEs = allIDEs;
	}

	public List<String> getAllServers() {
		return allServers;
	}

	public void setAllServers(List<String> allServers) {
		this.allServers = allServers;
	}

	public String onFlowProcess(FlowEvent event) {

		if (skip) {
			skip = false; // reset in case user goes back
			return "confirm";
		} else {
			return event.getNewStep();
		}
	}
	
	public void handleCountryChange(String city) {  
        if(city !=null && !city.equals(""))  
            cities = citiesData.get(city);  
        else  
            cities = new HashMap<String, String>();  
    } 

	public void save(ActionEvent actionEvent) {
		// Persist user

		FacesMessage msg = new FacesMessage("Successful", "Welcome to Jobsite");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
