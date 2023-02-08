package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static void main(String[] args) {
        Product p=new Product();
        p.product(1,2);
        //System.out.println(p.product(1,2));
        p.product(1,2,3);
        //System.out.println(p.product(1,2,3));
        p.product(1.2,2.2);
        System.out.println(p.product(1.2,2.2));


    }
static class Product{

    public int product(int x, int y) {
        return 0;
    }
    public int product(int x, int y, int z) {
        return 0;
    }
    public double product(double x, double y) {
        return (double) 0;
    }
}
}
