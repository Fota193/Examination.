/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;
import java.util.*;

/**
 *
 * @author Student
 */
public class SalesReport {
    Scanner scan = new Scanner(System.in);
    String[] names ={"cozy Nights Monarch", "Barbados", "Sealy Phuket"};
    int[][] Sales = new int[3][3];
    Product [] products = new Product[3];
    
    for(int p = 0; p < names.length; p++) {
    for (int m = 0; p < 3; m++) {
        System.out.print("Enter number of sales for month " + (m +1) + "for " + names[p] + "mattress: ");
    }
    products[p] = new Product (names[p], Sales[p]);
    
    }
    
   int grandtotal = 0;
   Product best = products[0];
   for (Product p : products) {
        grandtotal += p.totalSold();
        if (p.totalSold() > best.totalSold()) best = p;
    }
    System.out.println("\n*************************************");
    for (Product p : products) {
        System.out.println("Total sales for " + p.getName() + ": " + p.totalSold() ;
        System.out.printf("Average sales for %s: %.2fn, p.getname(), p.averagesSold");
    }
    System.out.println("TOTAL PRODUCT SALES : " + grandTotal);
    System.out.printf("AVERAGE PRODUCT SALES :%.2fn", grandTotal / (double) products.length);
    System.out.println("MOST POPULAR PRODUCT: " + best.getName());

   }
}
