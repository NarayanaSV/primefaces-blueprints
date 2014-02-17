package com.packt.pfblueprints.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.packt.pfblueprints.dao.ServiceCenterDAO;
import com.packt.pfblueprints.model.ServiceCenter;

@ManagedBean
@ViewScoped
public class ServiceCenterController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ServiceCenter> servicecenterInfo=new ArrayList<ServiceCenter>();
	
	private ServiceCenter servicecenterobj=new ServiceCenter();
	
	@PostConstruct
	public void init() { 
		System.out.println("bean initialized");
		ServiceCenterDAO dao;
		dao = new ServiceCenterDAO();
		servicecenterInfo=dao.getAllDealers();
		
	}
	
	public void deleteDealer(){
		
	}

	public ServiceCenter getServicecenterobj() {
		return servicecenterobj;
	}

	public void setServicecenterobj(ServiceCenter servicecenterobj) {
		this.servicecenterobj = servicecenterobj;
	}

	public List<ServiceCenter> getServicecenterInfo() {
		return servicecenterInfo;
	}

	public void setServicecenterInfo(List<ServiceCenter> servicecenterInfo) {
		this.servicecenterInfo = servicecenterInfo;
	}
	

}