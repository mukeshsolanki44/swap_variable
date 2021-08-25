package com.company;

public class Main {

    public static void main(String[] args) {

        // swip a and b thorw addation and subtraction

        int a = 10;
        int b = 20;
        System.out.println("------Before Using Swap------");

        System.out.println("a ===> " + a);
        System.out.println("b ===> " + b);

        a = a + b;
        b = a-b;
        a = a - b;
        System.out.println("------After Using Swap------");

        System.out.println("a ===> " + a); //now a = 20
        System.out.println("b ===> " + b); //now b = 10

        //swip c and d thorw Multiplaction and Division

        int c = 10;
        int d = 5;
        System.out.println("------Before Using Swap------");

        System.out.println("c ===> " + c);
        System.out.println("d ===> "+ d);

        c = c*d;
        d = c/d;
        c = c/d;
        System.out.println("------After Using Swap------");

        System.out.println("c ===> " + c);
        System.out.println("d ===> "+ d);

        System.out.println("......Mukesh Kumar .......");


    }
}
