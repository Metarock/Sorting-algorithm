package shell;

public class Shell {

    public static void main(String[] args) {
        // write your code here
        int[] intArray = {20, 35 ,-15, 7 ,55, 1, -22};


        /**
         * Implementation of Shell sort algorithm
         * WE need the gap value to be 1 at its final
         * iteration. On each iteration we're going to divide
         * the gap value by 2
         */

        for(int gap = intArray.length / 2; gap > 0; gap /= 2){
            /**
             * Implementation of comparing and shifting
             */
            for(int i = gap; i < intArray.length; i ++) {
                //value we are going to be looking at
                int newElement = intArray[i];

                int j = i ; //this will be for traversing

                /**
                 * If j becomes less than the gap, it means we hit the front of the array
                 *
                 */
                while( j >= gap && intArray[j - gap] > newElement) {
                    //shift the elemet up in gap positions
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                //found the insertion
                intArray[j] = newElement;
            }
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
