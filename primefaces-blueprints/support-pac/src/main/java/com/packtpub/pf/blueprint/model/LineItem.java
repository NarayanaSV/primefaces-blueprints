package com.packtpub.pf.blueprint.model;

/**
 * Created with IntelliJ IDEA.
 * User: psramkumar
 * Date: 1/6/14
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class LineItem {
    private Integer menuItemId;
    private String displayName;
    private int quantity;
    private double price;
    private String instruction;

    public LineItem(Integer menuItemId, String displayName, int quantity, double price) {
        this.menuItemId = menuItemId;
        this.displayName = displayName;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
