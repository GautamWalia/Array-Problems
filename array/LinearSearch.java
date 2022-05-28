package com.practice.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int[] a= {4,6,5,2,1,3,8};
        System.out.println("Please Enter item to search in the list?");
        Scanner s=new Scanner(System.in);
        int item= s.nextInt();
        int temp=0;

        for(int i=0; i<a.length; i++){
            if(item==a[i]){
                System.out.println("Item "+item+" is at index position:"+i);
                temp= temp+1;
            }
        }
        if(temp==0){
            System.out.println("Item "+item+" not found in the list");
        }
    }
}
