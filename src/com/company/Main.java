package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] intArray = {20, 35 ,-15, 7 ,55, 1, -22};

        //implementation of the algorithm
        //sorted partition is growing from right to left
        //Index is going from 6 to 0
        //Sorting in ascending order, bubbling large values at the end of the array
        //algorithm grows in an quadratic way O(n^2)
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
            //Inner for loop
            for(int i = 0; i < lastUnsortedIndex; i++) {
                //compare the value at i with i + 1
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        //after the bubble is sorted
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    //Bubble swap method
    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        //temp variable
        int temp = array[i];
        //what used to be in position J will be in position I
        array[i] = array[j];
        //what used to be in position I will be in position J
        array[j] = temp;

    }
}
