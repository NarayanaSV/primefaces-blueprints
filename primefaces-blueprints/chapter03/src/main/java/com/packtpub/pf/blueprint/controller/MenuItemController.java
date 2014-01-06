package com.packtpub.pf.blueprint.controller;

import com.packtpub.pf.blueprint.model.Category;
import com.packtpub.pf.blueprint.model.LineItem;
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

        for (int i = 0; i < 15; i++) {
            categories.add(new Category(i, "category" + i, 0, true, ""));
        }

        //instead we can populate from Database.

    }

    public void findAllMenuItemsForCategory(int categoryId) {
        Random rand = new Random(50);
        //instead we can populate from Database.

        for (int i = 0; i < 15; i++) {
            menuItems.add(new MenuItem(i, "Name" + i, "Name" + i, rand.nextDouble(), true, categoryId));
        }
    }

    public void addLineItem(int id, String displayName, double price) {
        LineItem mi = new LineItem(id, displayName, 1, price);
        if (lineItems.contains(mi)) {
            //already added to ticket updating quantity...
            for (LineItem li : lineItems) {
                if (li.getMenuItemId() == id) {
                    li.setQuantity(li.getQuantity() + 1);
                    break;
                }
            }
        } else {
            lineItems.add(mi);
        }
        updateTotal();
    }

    private void updateTotal() {
        for (LineItem li : lineItems) {
            lineTotal += li.getPrice() * li.getQuantity();
        }
    }

    public void addtoFavorite(int id) {
        for (MenuItem mi : menuItems) {
            if (mi.getId() == id) {
                if (!favoriteItems.contains(mi)) {
                    favoriteItems.add(mi);
                    break;
                }
            }
        }
    }

    private Category category;
    private MenuItem menuItem;
    private double lineTotal = 0;


    private List<Category> categories = new ArrayList<Category>();
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    private List<MenuItem> favoriteItems = new ArrayList<MenuItem>();

    public List<MenuItem> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(List<MenuItem> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

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

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }


    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }
}
