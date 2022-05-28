package com.practice.array;

public class DivideArray
{
    public static void main(String[] args)
    {
        int[] arr= {10,20,30,40,50,60,70,80};
        int leng= arr.length/2;

        for(int i=0; i<leng; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n---------------");
        for(int i=leng; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
