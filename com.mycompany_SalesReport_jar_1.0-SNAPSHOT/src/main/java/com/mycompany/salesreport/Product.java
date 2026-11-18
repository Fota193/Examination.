/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public abstract class Product implements IProduct {
    private final String name = null;
    private final int [] monthlySales = null;
    
    public Product(String[] name, int[] monthlySales) {
        this.Names = Names;
        this.sales = sales;
    }
    
    private int totalFor(int p) {
        int t = 0;
        for (int s : sales[p]) t += s;
        return t;
    }
    
    @Override
    public int GetTotalProductSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) total += totalFor(p);
        return total;
        
    }
    @Override
    public double GetAverageProductSold() {
        return GetTotalProductsSold() / (double) sales.length;
    }
    @Override
    public String GetMostPopularProduct() {
        int best = 0;
        for (int p = 1; p < sales.length; p++);
    }
    return names[best];
    }
}