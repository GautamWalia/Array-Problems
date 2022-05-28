package com.practice.array;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr= {10,2,8,3,13,12,4,9,7,19};

        int leng= arr.length;

        QuickSort quickSort= new QuickSort();

        quickSort.quickRecursionSort(arr, 0, leng-1);

        quickSort.printArray(arr);

    }
    public int partition(int[] arr, int leftPointer, int rightPointer)
    {
        int pivot= arr[(leftPointer + rightPointer)/2];
        while(leftPointer <= rightPointer)
        {
            while(arr[leftPointer]<pivot)
            {
                leftPointer++;
            }
            while(arr[rightPointer]>pivot)
            {
                rightPointer--;
            }
            if(leftPointer<=rightPointer)
            {
                int temp= arr[leftPointer];
                arr[leftPointer]= arr[rightPointer];
                arr[rightPointer]= temp;

                leftPointer++;
                rightPointer--;
            }
        }
    return leftPointer;
    }
    public void quickRecursionSort(int[] arr, int leftPointer, int rightPointer)
    {
        int pi= partition(arr, leftPointer, rightPointer);

        if(leftPointer< pi-1)
        {
            quickRecursionSort(arr, leftPointer, pi - 1);
        }
        if(rightPointer> pi)
        {
            quickRecursionSort(arr, pi, rightPointer);
        }
    }
    void printArray(int[] arr)
    {
        for(int a: arr)
        {
            System.out.print(a+" ");
        }
    }
}
