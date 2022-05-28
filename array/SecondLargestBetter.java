package com.practice.array;

public class SecondLargestBetter {
    public static void main(String[] args){
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;

        int[] a= {10,15,94,6,13,77,45,84};

        for(int i=0; i<a.length; i++){
            if(a[i]>largest){
                secondLargest= largest;
                largest= a[i];
            }else if(a[i]>secondLargest && !(secondLargest==largest)){
                secondLargest= a[i];
            }
        }
        System.out.println("Second largest number is: "+secondLargest);
    }
}
