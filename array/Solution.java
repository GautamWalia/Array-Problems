package com.practice.array;

public class Solution {
  static   int[] arr= {4,2,7,3,1};
  static int[] temp= new int[2];
        public int[] twoSum(int[] arr, int target) {

            for(int i=0; i<arr.length-1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if ((arr[i] + arr[j]) == target) {
                        int a = i;
                        int b = j;
                        temp[0] = a;
                        temp[1] = b;
                    }

                }
            }
          //  System.out.println("two integers sum is not present in the given array ");
            return temp;
        }
        public static void main(String[] args){
            Solution sol= new Solution();
            System.out.print("two integers index evaluating target sum are: ");
            sol.twoSum(arr ,10);
            for (int no: temp)
            {
                System.out.print(no+", ");
            }
        }

}
