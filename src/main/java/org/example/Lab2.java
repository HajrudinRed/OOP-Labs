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


    }
    //methods here

}
