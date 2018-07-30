package com.company;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Computer computer = new Computer();
        catalog.addProduct(new Laptop());
        catalog.addProduct(computer);
        catalog.addProduct(new Smartphone());
        catalog.showProductInfo();
        catalog.removeProduct(computer);
        catalog.showProductInfo();

    }
}
