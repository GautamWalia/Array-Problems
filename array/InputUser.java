package com.practice.array;

import java.util.Scanner;

public class InputUser {


        public static void main(String[] args){
            int a= 5;
            int b, add;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter first number:");
            a=s.nextInt();
            System.out.println("Enter second number:");
            b=s.nextInt();
            //a += b; a= a+b; a|= b;
            add =a+b;

            System.out.println("Addition is:"+" "+add);


        }



}
