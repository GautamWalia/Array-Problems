package com.practice.array;

import java.util.HashSet;
import java.util.Set;

// this method fails if element is repeating more than 2 times
public class FindDuplicate2
{

    public static void main(String[] args)
    {
        int[] arr= {5,2,3,2,3,1,7};
        System.out.print("Duplicate elements are: ");
        Set<Integer> s= new HashSet<>();
        for(int no: arr)
        {
            boolean b= s.add(no);
            if(!b)//b==false
            {
                System.out.print(no+" ");
            }
        }
    }
}
