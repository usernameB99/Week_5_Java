package Woche5;

import java.util.Arrays;
import java.util.Random;

public class Merge_Sort {
    public static void main(String[] args) {


        int [] numbers = new int [10];
        Random r = new Random();


        System.out.println(" Array:");
        for (int i = 0; i < numbers.length; i++) {                  //filling array with random numbers (100)
            numbers[i] = r.nextInt(100);
            System.out.print(" " + numbers[i]);
        }
        System.out.println();


        splitArray(0, numbers.length, numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }


    }

    public static void splitArray (int left, int right, int[] array){

        int mid = (left + right) / 2;

        if (array.length <= 1) {
            return;
        }

        int [] leftArray = Arrays.copyOfRange(array, left, mid);
        int [] rightArray = Arrays.copyOfRange(array, mid, right);

        splitArray(left,leftArray.length,leftArray);
        splitArray(left,rightArray.length,rightArray);

        int i1 = 0;
        int i2 = 0;
        int j = 0;

        while (i1 < leftArray.length && i2 < rightArray.length){

            if (leftArray[i1] < rightArray[i2]){
                array[j++] = leftArray[i1++];
            }
            else {
                array[j++] = rightArray[i2++];
            }
        }
            while (i1 < leftArray.length){

                array[j++] = leftArray[i1++];
            }

            while (i2 < rightArray.length){

                array[j++] = rightArray[i2++];
            }


    }



}
