package com.practice.array;

// it is efficient only for small list like this showing below
public class MissingElement1
{
    public static void main(String[] args)
    {
        int[] a= {1, 2, 3, 4,5,7};
        int exp_no_element= a.length+1;

        int exp_total_sum= (exp_no_element*(exp_no_element+1))/2;

        int sum=0;
        for(int i=0; i<a.length;i++)
        {
            sum= sum+a[i];
        }
        System.out.println("Missing element in array is: "+(exp_total_sum-sum));
    }
}
