/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variable Declaration
        Scanner input = new Scanner(System.in);
        String state;
        double orderAmount, subtotal, tax, total;

        //Query
        System.out.println("What is the order amount?");
        orderAmount = input.nextDouble();

        System.out.println("What is the state?");
        state = input.next();

        //If statement for tax
        if (state.equals("WI"))
        {
            subtotal = orderAmount;
            tax = 0.055;
            total = subtotal + (subtotal * tax);

            //Final output
            System.out.format("The subtotal is: $%.2f\n", subtotal);
            System.out.format("The tax is: $%.2f\n", tax);

        }
        else
        {
            total = orderAmount;
        }
        System.out.format("The total is: $%.2f", total);

    }
}
