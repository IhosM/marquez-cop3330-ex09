/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise9;

import java.util.Scanner;


public class Solution9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double paintCoverage = 350;

        System.out.print("Enter length: ");
        double length = scan.nextDouble();

        System.out.print("Enter width: ");
        double width = scan.nextDouble();

        double total = length * width;

        int gallon = (int)Math.ceil(total / paintCoverage);
        System.out.println("You will need to purchase " + gallon + " of paint to cover " + total + " square feet.");
    }
}
