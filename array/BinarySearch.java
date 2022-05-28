package com.practice.array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        int[] a= {1,5,7,9,11,13,15};
        System.out.println("Please Enter item to search in the list?");
        Scanner s=new Scanner(System.in);
        int item= s.nextInt();

        int li = 0;
        int hi = a.length;


        while(li<=hi) {
            int mi = (li + hi) / 2;
            if(item==a[mi]){
                System.out.print(item+" is at index position "+mi);
                break;
            }
            if(item<a[mi]){
                hi= mi-1;
            }
            if(item>a[mi]){
                li= mi+1;
            }

            if(li>hi){
                System.out.println("Item not found in the list");
            }
        }
    }
}
