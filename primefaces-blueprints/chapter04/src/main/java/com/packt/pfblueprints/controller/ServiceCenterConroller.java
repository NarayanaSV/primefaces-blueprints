package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.packt.pfblueprints.dao.ServiceCenterDAO;
import com.packt.pfblueprints.model.ServiceCenter;

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
		ServiceCenterDAO dao;
		try {
			dao = new ServiceCenterDAO();
			servicecenterInfo=dao.getAllDealers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public ServiceCenter getServicecenterobj() {
		return servicecenterobj;
	}

	public void setServicecenterobj(ServiceCenter servicecenterobj) {
		this.servicecenterobj = servicecenterobj;
	}
	

}
