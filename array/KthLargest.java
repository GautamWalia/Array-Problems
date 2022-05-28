package com.practice.array;

public class KthLargest {
    public static void main(String[] args){
        int[] a= {44,5,16,8,12,6,3,77,55,11};
        int k=6, temp;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    temp= a[i];
                    a[i]= a[j];
                    a[j]= temp;
                }
            }
            if(i==(k-1)){
                System.out.println(k+" largest element is: "+a[k-1]);
                break;
            }
        }

        for(int i: a){
            System.out.print(i+" ");
        }
    }
}
