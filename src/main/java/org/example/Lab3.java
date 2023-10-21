package org.example;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        drawInvertedStarsPiramid(5);
        System.out.println();
        drawInvertedStarsPiramid(10);


    }

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
}




