package selection.sort;

public class SelectSort {

    public static void main(String[] args) {
        // write your code here
        int[] intArray = {20, 35 ,-15, 7 ,55, 1, -22};

        //implementation of the for selected sort algorithm
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
            //initialise our largest element
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {

                //traverse the unsorted partition
                //if the current element value is greater than the largest element value
                //set the largest value to it
                if (intArray[i] > intArray[largest]) {
                    //swap the elements
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        //after the bubble is sorted
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    //swap method
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
