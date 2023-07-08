package com.drevin.behavioral.iterator;

public class ProductCollection implements Collection{

    int numberOfProduct = 0;
    Product [] products;

    public ProductCollection(){
        products = new Product[10];
    }

    public void addProduct(Product product){
        products[numberOfProduct] = product;
        numberOfProduct ++;
    }

    @Override
    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
