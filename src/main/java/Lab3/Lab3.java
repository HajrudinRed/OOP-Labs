package org.example;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        drawNumbersPyramid(5);
        System.out.println();
        drawNumbersPyramid(10);


    }

    public static void drawNumbersPyramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print numbers from 1 to the current row count
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }

            // Print spaces for padding on the right
            for (int j = i + 1; j <= numRows; j++) {
                System.out.print(" ");
            }

            // Move to the next line for the next row
            System.out.println();
        }



    }
}

