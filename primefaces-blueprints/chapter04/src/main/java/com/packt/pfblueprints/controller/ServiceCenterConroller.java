package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.packt.pfblueprints.dao.ServiceCenterDAO;
import com.packt.pfblueprints.model.ServiceCenter;

@ManagedBean
@ViewScoped
public class ServiceCenterConroller implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<ServiceCenter> servicecenterInfo=new ArrayList<ServiceCenter>();
	
	ServiceCenter servicecenterobj=new ServiceCenter();
	
	@SuppressWarnings("restriction")
	@PostConstruct  
	public void init() { 
		System.out.println("bean initialized");
		ServiceCenterDAO dao;
		try {
			dao = new ServiceCenterDAO();
			servicecenterInfo=dao.getAllDealers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteDealer(){
		
	}

	public ServiceCenter getServicecenterobj() {
		return servicecenterobj;
	}

	public void setServicecenterobj(ServiceCenter servicecenterobj) {
		this.servicecenterobj = servicecenterobj;
	}
	

}
