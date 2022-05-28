package com.practice.array;

public class SecondLargest {
    public static void main(String[] args){
        int[] a= {12,88,55,14,6,13,21,77,74};

        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    int temp= a[i];
                    a[i]= a[j];
                    a[j]= temp;
                }
            }
            if(i==1){
                break;
            }
        }
        System.out.println("Second largest element is: "+a[1]);
        for(int i: a){
            System.out.print(i+" ");
        }
    }
}
