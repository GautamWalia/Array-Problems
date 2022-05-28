package com.practice.array;

import java.util.HashSet;

public class CommonElements2
{
    public static void main(String[] args)
    {
        int[] a={4,5,7,2,9,4,6};
        int[] b={4,5,8,7,3,9,7};

        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> hs1= new HashSet<>();
        System.out.print("Common elements in 2 arrays are: ");
        for(int no: a)
        {
            hs.add(no);
        }
//        for(int no: b) //if numbers are already duplicate in 1 array then it will print again & again
//        {
//            boolean bo =hs.add(no);
//            if(bo==false)
//            {
//                System.out.print(no);
//            }
//        }
        for(int no: b)
        {
            hs1.add(no);
        }
        for(int no: hs1)
        {
            boolean bo = hs.add(no);
            if (bo == false)
            {
                System.out.print(no+" ");
            }
        }
    }
}
