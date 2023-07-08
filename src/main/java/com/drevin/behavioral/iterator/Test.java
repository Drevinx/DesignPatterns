package com.drevin.behavioral.iterator;

public class Test {

    public static void main(String[] args) {

        ProductCollection productCollection = new ProductCollection();
        productCollection.addProduct(new Product("Phone"));
        productCollection.addProduct(new Product("PC"));
        productCollection.addProduct(new Product("NB"));
        productCollection.addProduct(new Product("Watch"));

        Iterator iterator = productCollection.createIterator();

        Product product = null;
        while (iterator.hasNext()){
           product = (Product) iterator.next();
            System.out.println(product.getName());
        }

    }
}
