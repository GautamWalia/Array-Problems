package com.practice.array;

public class SecondSmallestBetter {
    public static void main(String[] args){
        int smallest= Integer.MAX_VALUE;
        int secondSmallest= Integer.MAX_VALUE;

        int[] a= {10,15,94,16,13,77,45,84};

        for(int i=0; i<a.length; i++){
            if(a[i]<smallest){
                secondSmallest= smallest;
                smallest= a[i];
            }else if(a[i]<secondSmallest && !(secondSmallest==smallest)){
                secondSmallest= a[i];
            }
        }
        System.out.println("Second smallest number is: "+secondSmallest);
    }
}
