package com.practice.array;

public class SearchSmall {
    public static void main(String[] args){
        int[] a= {4,5,8,2,3,1,6};
        int min= a[0];

        for(int i=1; i<a.length; i++){
            if(min>a[i]){
                min= a[i];
            }
        }
        System.out.println("Minimum is:"+min);
    }
}
