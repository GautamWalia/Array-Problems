package com.practice.array;

public class FindFirstDuplicate
{
    public static void main(String[] args)
    {
        int[] a= {6,11,4,5,8,4,1};
        int temp=0;
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=i+1; j<a.length;j++)
            {
                if(a[i]==a[j] && (i!=j) )
                {
                    temp= temp+1;
                    System.out.println("First duplicate element is: "+a[j]);
                    break;
                }
            }
            if(temp>0)
            {
                break;
            }
        }
    }
}
