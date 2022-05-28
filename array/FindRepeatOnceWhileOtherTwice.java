package com.practice.array;

public class FindRepeatOnceWhileOtherTwice
{
    public static void main(String[] args)
    {
        int[] a= {2,3,5,4,3,2,5,4,1};
        int res= a[0];

        for(int i=1; i<a.length; i++)
        {
            res= res^a[i];
        }
        System.out.println("Once repeated element is: "+res);
    }
}
