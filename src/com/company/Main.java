package com.company;


import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

import static java.io.FileDescriptor.in;

public class Main {

    public static void main(String[] args) {
        // write your code here




        int ph=4;
        for (int i = 1; i <=ph ; i++)
        {
            for (int k = ph; k >=i ;k--)
            {
                System.out.print(" ");
                for (int j = 1; j <=i ; j++)
                {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }

    }
}



























































