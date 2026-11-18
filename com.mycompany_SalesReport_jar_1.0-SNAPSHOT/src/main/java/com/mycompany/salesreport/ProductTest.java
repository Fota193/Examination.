/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author Student
 */
public class ProductTest {
    private final String[] names = {"cozy Nights Monarch", "Barbados", "Sealy Phuket" };
    private final int [][]  sales = {{10, 20, 30}, {5,5,5}, {1, 2, 3};
    
    @Test
    public void GetTotalProductSales_WithValidData_ReturnCorrectValue(){
        Product product = new Product (names, sales);
        assertEquals(81, product.GetTotalProductsSold());
    }
    
    @Test
    public void GetAverageSales_WithValidData_ReturnCorrectValue(){
        Product product + new product(names, sales);
        assertEquals(27.0, product.GetAverageProductSold()), 0.001);
    }
}
