package com.company;

import java.util.ArrayList;

public class Store {

    private ArrayList<Vendor>vendorArrayList;
    private ArrayList<Product>productArrayList;

    public Store(ArrayList<Vendor> vendorArrayList){
        this.vendorArrayList = vendorArrayList;
    }

    public ArrayList<Vendor> getVendorArrayList() {
        return vendorArrayList;
    }

    public void setVendorArrayList(ArrayList<Vendor> vendorArrayList) {
        this.vendorArrayList = vendorArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {

        this.productArrayList = productArrayList;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }
}
