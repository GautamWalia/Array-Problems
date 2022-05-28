package com.practice.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// using Hash Table method
public class FindDuplicate3
{
    public static void main(String[] args)
    {
        int[] a= {5,1,3,2,3,7,2,3,2,3,2};
        Map<Integer,Integer> hm= new HashMap<>();
        for(int no:a)
        {
            Integer count= hm.get(no);
            if(count==null)
            {
                hm.put(no,1);
            }
            else
            {
                count= count+1;
                hm.put(no,count);
            }
        }
        Set<Map.Entry<Integer,Integer>> es= hm.entrySet();
        System.out.print("Duplicate elements are: ");
        for(Map.Entry<Integer,Integer> me: es)
        {
            if(me.getValue()>1)
            {
                System.out.print(me.getKey()+" ");
            }
        }
    }
}
