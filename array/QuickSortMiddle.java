package com.practice.array;

public class QuickSortMiddle {
    public static void main(String[] args){
        int[] arr= {12,85,14,6,13,2,94,1};
        int leng= arr.length;
        QuickSortMiddle qsm= new QuickSortMiddle();
        qsm.quickSortRecursion(arr,0,leng-1);
        qsm.printArray(arr);

    }
    int partition(int[] arr,int low,int high){
        int pivot= arr[(low+high)/2];
        while(low<= high){
            while(arr[low]< pivot){
                low++;
            }
            while(arr[high]> pivot){
                high--;
            }
            if(low<= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }return low;
    }
    public void quickSortRecursion(int arr[], int low, int high){
        int pi= partition(arr, low, high);
        if(low< pi-1){
            quickSortRecursion(arr,low,pi-1);
        }
        if(high> pi){
            quickSortRecursion(arr,pi,high);
        }
    }
    public void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
