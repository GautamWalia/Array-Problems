package com.practice.array;

import java.util.ArrayList;

public class OddEven
{
    public static void main(String[] args)
    {
        int[] a= {4,6,1,3,8,5,2};

        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2= new ArrayList<>();

        for(int i=0; i<a.length;i++)
        {
            if ((a[i] % 2) == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }
        }
        System.out.print("Even elements in array are: ");
        int total1 = 0;
        for(int no: al1)
        {
            total1= total1+no;
            System.out.print(no+" ");
        }
        System.out.print("\nSize of array of even numbers are: "+al1.size());
        System.out.println("\nTotal sum of even numbers are: "+total1);
        System.out.println("-----------------------------");

        int total2 = 0;
        System.out.print("Odd elements in array are: ");
        for(int no: al2)
        {
            total2= total2+no;
            System.out.print(no+" ");
        }

        System.out.print("\nSize of array of odd numbers are: "+al2.size());
        System.out.println("\nTotal sum of odd numbers are: "+total2);
    }
}
