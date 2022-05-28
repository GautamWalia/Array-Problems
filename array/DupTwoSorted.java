package com.practice.array;

import java.util.HashSet;

public class DupTwoSorted
{
    public static void main(String[] args)
    {
        int[] a= {1,2,2,3,4,5};
        int[] b= {3,3,4,4,6,7};

        HashSet<Integer> hs1= new HashSet<>();
        HashSet<Integer> hs2= new HashSet<>();
        for(int no: a)
        {
            hs1.add(no);
        }
        for(int no: b)
        {
            hs2.add(no);
        }

        int count=0;
        for(int no: hs2)
        {
            boolean bo= hs1.add(no);
            if (bo == false)
            {
                System.out.print("Duplicate elements in 2 sorted arrays are: ");
                System.out.print(no + " ");
                count++;
            }

        }
        if(count==0)
        {
        System.out.println("no duplicate element found");
        }
    }
}
