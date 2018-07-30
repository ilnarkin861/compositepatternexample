package com.company;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements Product {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){ products.add(product);}

    public void removeProduct(Product product){ products.remove(product);}

    @Override
    public void showProductInfo() {
        products.forEach(i->i.showProductInfo());
    }
}
