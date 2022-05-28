package com.practice.array;

import java.util.Random;

public class QuickSortLast
{
    public static void main(String[] args)
    {
        QuickSortLast qsl= new QuickSortLast();

        Random random= new Random();
        int[] numbers= new int[10];
        for(int i= 0; i< numbers.length; i++)
        {
            numbers[i]= random.nextInt(1000);
        }
        System.out.print("array before sorting: ");
        qsl.printArray(numbers);

        quickSort(numbers, 0, numbers.length-1);

        System.out.print("\narray after sorting: ");
        qsl.printArray(numbers);
    }
    private static void quickSort(int[] array, int lowIndex, int highIndex)
    {
        if(lowIndex >= highIndex)
        {
            return;
        }

        int pivot= array[highIndex];
        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array, lowIndex, leftPointer-1);
        quickSort(array, leftPointer+1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer= lowIndex;
        int rightPointer= highIndex;

        while(leftPointer < rightPointer)
        {
            while(array[leftPointer]<= pivot && leftPointer < rightPointer)
            {
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer)
            {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2)
    {
        int temp= array[index1];
        array[index1]= array[index2];
        array[index2]= temp;
    }
    void printArray(int[] array)
    {
        for (int n: array)
        {
            System.out.print(n+" ");
        }
    }
}
