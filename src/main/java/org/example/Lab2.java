package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        //Exercises:
        //1.
        Scanner reader = new Scanner(System.in);
        String password ="carrot";
        String UserPassword;
        while(true){
            System.out.println("Enter the password to hear a secret message:");
            String userPassword = reader.nextLine();
            if(userPassword.equals(password)){
                System.out.println("Right!");
                break;
            }else{
                System.out.println("Wrong!");
            }
            System.out.println("Type the passworld Again!");

        }
        System.out.println("The secter is: jres sdge");
        //2.
        int sum=0;
        int read;
        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum+=read;
        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum+=read;
        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum+=read;
        System.out.println("Sum: "+sum);
        //3.
        int sum1=0;
        while(true){
            System.out.println("Enter a Number to sum up:");
            int read1 = Integer.parseInt(reader.nextLine());
            if(read1==0){
                break;
            }else{
                sum1+=read1;
            }

            System.out.println("Sum now: "+sum1);
        }
        System.out.println("Sum in the End is: "+sum1);
        //4.
        System.out.println("Enter the first Number: ");
        int firstNumber =Integer.parseInt(reader.nextLine());
        System.out.println("Enter the last Number: ");
        int lastNumber =Integer.parseInt(reader.nextLine());
        System.out.println("First: "+firstNumber);
        System.out.println("Last: "+lastNumber);
        while(true){
        if(!(firstNumber>lastNumber)){
            System.out.println(firstNumber);
            firstNumber++;

        }else{
            break;
        }
        }
        //5.
        System.out.println("Enter a Number: ");
        int i = Integer.parseInt(reader.nextLine());
        int result = (int)Math.pow(2,i);
        System.out.println("The result is: " + result);
        //6.
        printText();
        System.out.println("How many times do u want the Text above to be printed?");
        int textPrint = Integer.parseInt(reader.nextLine());
        int n=0;
        while(n<textPrint){
            printText();
            n++;
        }
        //7.
        printStars(5);
        printStars(3);
        printStars(9);
        //8.
        drawStarsPiramid(5);
        drawStarsPiramid(10);
        //8.2
        drawInvertedStarsPiramid(5);
        drawInvertedStarsPiramid(10);
        //9.


    }
    //methods here
    //6.
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    //7.
    public static void printStars(int amount){
         int m =0;
        while(m<amount) {
            System.out.print("*");
            m++;
        }
        System.out.println();
    }
    public static void drawStarsPiramid(int rows){
        int n=1;
        while(n<=rows){
            int j =1;
            while(j<=n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            n++;
        }

        System.out.println();

    }
    //8.2
    public static void drawInvertedStarsPiramid(int rows){
        int g=rows;
        while(g>=1){
            int h =g;
            while(h>=1){
                System.out.print("* ");
                h--;
            }
            System.out.println();
            g--;
        }

        System.out.println();
    }
    //9.
    public static void drawNumbersPiramid(int rows){
        int r=1;
        while(r<=rows){
            int t =1;
            while(t<=r){
                System.out.print("* ");
                t++;
            }
            System.out.println();
            r++;
        }

        System.out.println();

    }








}

