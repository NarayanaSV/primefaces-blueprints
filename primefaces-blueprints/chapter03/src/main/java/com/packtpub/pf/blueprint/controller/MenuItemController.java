package com.packtpub.pf.blueprint.controller;

import com.packtpub.pf.blueprint.model.Category;
import com.packtpub.pf.blueprint.model.MenuItem;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Ramkumar Pillai
 * Date: 12/27/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@RequestScoped
public class MenuItemController {
    private static final Logger _log = Logger.getLogger(MenuItemController.class);

    @PostConstruct
    public void init() {
        _log.info("Initilized now here : " + System.currentTimeMillis());
        populateCategory();
    }

    private void populateCategory() {

        for (int i = 0; i <= 15; i++) {
            categories.add(new Category(i, "category" + i, 0, true));
        }

        //instead we can populate from Database.

    }

    public void findAllMenuItemsForCategory(int categoryId) {
        Random rand = new Random(50);
        //instead we can populate from Database.

        for (int i = 0; i <= 15; i++) {
            menuItems.add(new MenuItem(i, "Name" + i, "Name" + i, rand.nextDouble(), true, categoryId));
        }
    }

    public void addLineItem(int id, String displayName, double price) {
        MenuItem mi = new MenuItem(id, displayName, displayName, price, true, 0);
        if (lineItems.contains(mi)) {
            return;
        }
        lineItems.add(mi);
        lineTotal += price;
    }

    private Category category;
    private MenuItem menuItem;
    private double lineTotal = 0;


    private List<Category> categories = new ArrayList<Category>();
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private List<MenuItem> lineItems = new ArrayList<MenuItem>();


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<MenuItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<MenuItem> lineItems) {
        this.lineItems = lineItems;
    }


    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }
}
