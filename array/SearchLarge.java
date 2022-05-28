package com.practice.array;

public class SearchLarge {
    public static void main(String[] args){
        int[] a= {4,5,8,2,3,1,6};
        int max= a[0];
        for(int i=1; i<a.length; i++){
            if(max<a[i]){
                max= a[i];

            }

        }
        System.out.println("Maximum is:"+max);
    }
}
