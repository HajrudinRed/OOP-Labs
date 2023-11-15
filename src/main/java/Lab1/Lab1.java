package org.example;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        //Exercises:
        //1.
        System.out.println("Hajrudin Bajraktarević");
        //2.
        System.out.println("Hello world!\n(And all the people of the world!)");
        //3.
        int days = 365;
        int hours = 24 ;
        int min = 60;
        int sec = 60;
        int YearSeconds = days*hours*min*sec;
        System.out.println("There are "+YearSeconds+" seconds in a Year!");
        //4.
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the second Numbers: ");
        int b = Integer.parseInt(reader.nextLine());
        int sum= a+b;
        System.out.println("The sum of those Numbers is:"+sum);
        //5.
        System.out.println("Enter another Number:");
        int c = Integer.parseInt(reader.nextLine());
        if(c>0){
            System.out.println("The Number is positive!");
        }else {
            System.out.println("The Number is not positive!");
        }
        //6.
        System.out.println("Enter two Numbers:");
        int d = Integer.parseInt(reader.nextLine());
        int e = Integer.parseInt(reader.nextLine());
        if (d>e){
            System.out.println("The number "+d+" is Greater!");
        } else if (d<e){
            System.out.println("The number "+e+" is Greater!");
        } else {
            System.out.println("The Numbers are Equal!");
        }
    }
}
