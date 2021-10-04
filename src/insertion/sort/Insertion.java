package insertion.sort;

public class Insertion {
    public static void main(String[] args) {
        // write your code here
        int[] intArray = {20, 35 ,-15, 7 ,55, 1, -22};

        //implementation of insertion sort algiorithm
        for (int firstUnsortedIndex = 1 ; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            //save the element
            int newElement = intArray[firstUnsortedIndex];

            int i;

            //traversal of the sorted partition and place the correct element
            //keep looking for the insertion position as long as it does not hit the front of the array
            // if not we have hit the lowest possible value
            //Additionally we want to keep looking as long as the element we're looking at,
            // is greater than the element we are trying to insert because if the element at i - 1 is greater
            // than the element we are trying to insert then we have not found the correct insertion position
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){

                //if we have not hit the front of the array
                //shift the element of i - 1 to the right
                // left --> right
                intArray[i] = intArray[i - 1];

            }

            //if we found the correction position
            intArray[i] = newElement;
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
