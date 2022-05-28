package com.practice.array;

// Brute Force Method
// it only works well when element is repeating 1 time only
public class FindDuplicate1 {
    public static void main(String[] args){
        int[] a= {5,3,1,2,2,3,4};
        //int count=0;
        System.out.print("Duplicates Elements Are: ");
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    //count= count+1;
                    System.out.print(a[j]+" ");
                }
            }
        }

    }
}
