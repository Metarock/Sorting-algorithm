package merge.sort;

public class Merge {

    public static void main(String[] args) {
        // write your code here
        int[] intArray = {20, 35 ,-15, 7 ,55, 1, -22, -100, 123,334};


        mergeSort(intArray, 0 , intArray.length);
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    /**
     * Implementation of Merge Sort algorithm
     */
    public static void mergeSort(int[] input, int start, int end) {

        /**
         * Recursive method
         */
        if(end - start < 2) {
            return;
        }

        //Partition the array we have been passed
        int mid = (start + end ) / 2;

        //left part of the array
        mergeSort(input, start, mid);

        //throw any leftover partition to the right part of the array
        mergeSort(input, mid, end);

        //merge the array
        merge(input, start, mid ,end);
    }


    /**
     * Merge method
     */
    public static void merge(int[] input, int start, int mid, int end) {

        //Always merging sorted ararys
        //Done no more merging
        if(input[mid - 1 ] <= input[mid]) {
            return;
        }

        //if not there is merging to do

        int i = start;
        int j = mid;
        int tempIndex = 0; //keep track of the temporary array

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            //if the left element is equal to the right element then it will be first
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //left over; second optimization; handle the remaining elements
        //Copying up to tempIndex
        //Source; Copy index; Destination Array; destination position index; tells us the amount of elements we did not copy
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        //copy to tempArray
        //If there are any leftover elements in the left array
        System.arraycopy(temp, 0, input, start , tempIndex);

    }
}
