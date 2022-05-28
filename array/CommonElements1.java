package com.practice.array;

import java.util.HashSet;

public class CommonElements1
{
    public static void main(String[] args)
    {
        int[] a={4,5,7,2,9,4,6};
        int[] b={4,5,8,7,3,9,7};

        HashSet<Integer> hs= new HashSet<>();
        System.out.print("Common elements in 2 arrays are: ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<b.length; j++)
            {
                if(a[i]==b[j])
                {
                    hs.add(a[i]);
                    //System.out.print(a[i]+" ");
                }
            }
        }
        System.out.println(hs+" ");
    }
}
