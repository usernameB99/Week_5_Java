package Woche5;

import java.util.Random;

public class Merge_Sort_2 {
    public static void main(String[] args) {

        int [] numbers = new int [20];
        Random r = new Random();


        System.out.println("unsorted Array:");
        for (int i = 0; i < numbers.length; i++) {                  //filling numbers with random numbers (100)
            numbers[i] = r.nextInt(100);
        }
        printIntArray(numbers);

        System.out.println();

        mergeSort(numbers);

        System.out.println("sorted Array:");

        printIntArray(numbers);


    }

    private static void mergeSort(int[]array){  // array splitter method

        int length = array.length;
        if (length <= 1) return;

        int middle = length / 2;
        int [] leftArray = new int [middle];
        int [] rightArray = new int [length - middle];
        
        int i = 0; //left array
        int j = 0; //right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array [i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }


    private static void merge(int[] leftArray, int[] rightArray, int [] array) {    // sort splited arrays

        int leftSize = array.length /2;
        int rightSize = array.length - leftSize;
        int i = 0;
        int l = 0;
        int r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

    public static void printIntArray(int [] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

}
