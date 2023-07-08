package com.drevin.behavioral.iterator;

public class ProductIterator implements Iterator{

    private Product[] products;
    private int pos = 0;

    public ProductIterator(Product[] products){
    this.products = products;
    }

    @Override
    public boolean hasNext() {
        if(pos >= products.length || products[pos] ==null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return products[pos++];
    }
}
