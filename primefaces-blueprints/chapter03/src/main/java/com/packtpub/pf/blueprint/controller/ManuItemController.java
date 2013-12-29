package com.packtpub.pf.blueprint.controller;

import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created with IntelliJ IDEA.
 * User: psramkumar
 * Date: 12/27/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@RequestScoped
public class ManuItemController {
    private static final Logger _log = Logger.getLogger(ManuItemController.class);

    @PostConstruct
    public void init() {
        _log.info("Initilized now here : " + System.currentTimeMillis());
    }
}
