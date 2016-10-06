package com.example.rajat_pc.msme_project;

/**
 * Created by RAJAT-PC on 01-10-2016.
 */
public class Product {
    public String pid;
    public Integer quantity;
    public Product()
    {
        super();
    }
    public Product(String s,int q)
    {
        this.pid = s;
        this.quantity = q;
    }
}
