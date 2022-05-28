package com.practice.array;

import java.util.HashSet;

public class FindFirstDuplicateUsingHashSet
{
    public static void main(String[] args)
    {
        int[] a= {6,2,6,3,2,1,4,5};
        int temp=-1;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=a.length-1; i>=0; i--)
        {
            if(hs.contains(a[i]))
            {
                temp=i;
            }
            else
            {
                hs.add(a[i]);
            }

        }
        if(temp!=-1)
        {
            System.out.println("First duplicate element is: "+a[temp]);
        }
        else
        {
            System.out.println("No duplicate element found");
        }
    }
}
