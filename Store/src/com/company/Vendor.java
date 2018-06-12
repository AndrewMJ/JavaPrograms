package com.company;

import java.util.ArrayList;

public class Vendor {

    private ArrayList<Product>prodArray;

    public Vendor(ArrayList<Product> prodArray){
        this.prodArray = prodArray;
    }

    public ArrayList<Product> getProdArray() {
        return prodArray;
    }
}
