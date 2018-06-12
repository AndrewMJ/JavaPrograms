package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vendor> Vendor;

        Product p = new Product("orange", "orange", 1.30);
        Product p1 = new Product("apple", "apple", 2.35);
        Product p2 = new Product("grapes", "grapes", 2.30);
        Product p3 = new Product("kiwi", "kiwi", 1.10);
        Product p4 = new Product("grapefruit", "grapefruit", 2.45);

        Product p5 = new Product("ladder", "ladder", 65.25);
        Product p6 = new Product("hammer", "hammer", 10.00);
        Product p7 = new Product("drill", "drill", 43.75);
        Product p8 = new Product("Tape measure", "Tape measure", 15.00);
        Product p9 = new Product("nails", "nails", 5.00);

        Product p10 = new Product("basketball", "basketball", 25.70);
        Product p11 = new Product("football", "football", 20.30);
        Product p12 = new Product("baseball", "baseball", 10.30);
        Product p13 = new Product("tennis ball", "tennis ball", 11.40);
        Product p14 = new Product("soccer bal1", "soccer", 15.50);

        ArrayList<Product> v1 = new ArrayList<Product>();
        ArrayList<Product> v2 = new ArrayList<Product>();
        ArrayList<Product> v3 = new ArrayList<Product>();

        v1.add(p);
        v1.add(p1);
        v1.add(p2);
        v1.add(p3);
        v1.add(p4);

        v2.add(p5);
        v2.add(p6);
        v2.add(p7);
        v2.add(p8);
        v2.add(p9);

        v3.add(p10);
        v3.add(p11);
        v3.add(p12);
        v3.add(p13);
        v3.add(p14);

        Vendor vendor1 = new Vendor(v1);
        Vendor vendor2 = new Vendor(v2);
        Vendor vendor3 = new Vendor(v3);

        ArrayList<Vendor> store = new ArrayList<Vendor>();
            store.add(vendor1);
            store.add(vendor2);
            store.add(vendor3);

            Store st = new Store (store);
            ArrayList<Product> storeProducts = st.getProductArrayList();




    }
}
