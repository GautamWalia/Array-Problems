package com.practice.array;

import java.util.Scanner;

public class OrderReverse
{
    public static void main(String[] args)
    {
//        int[] a= {6,8,9,1,3};
//
//        for(int i=a.length-1; i>=0; i--)
//        {
//            System.out.print(a[i]+" ");
//        }
//        //reading size and all elements of array from user
//        System.out.println("\nNext Program---------");
//        Scanner s= new Scanner(System.in);
//        System.out.println("Please enter the size of an array");
//        int size= s.nextInt();
//        int[] arr= new int[size];
//        System.out.println("Please enter "+size+" elements");
//        try
//        {
//            for (int i = 0; i < size; i++) {
//                arr[i] = s.nextInt();
//            }
//            System.out.print("After multiplication elements in an input array are: ");
//            for (int no : arr) {
//                System.out.print((no*10) + " ");
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            e.printStackTrace();
//        }

        System.err.println("\nNext Program---------");
        Scanner scanner= new Scanner(System.in);
        int[] arr1= new int[20];
        System.out.println("Please enter 20 values: ");
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i]= scanner.nextInt();
        }
        System.out.print("Even numbers in an input array are: ");
        for(int i=0; i<arr1.length;i++)
        {
            if(arr1[i]%2 ==0)
            {
                System.out.print(arr1[i]+" ");
            }

        }
        System.out.print("\nOdd numbers in an input array are: ");
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i]%2 !=0)
            {
                System.out.print(arr1[i]+" ");
            }
        }
    }
}
