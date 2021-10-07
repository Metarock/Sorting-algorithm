package Quick.sort;

public class Quick {
    public static void main(String[] args) {

        // write your code here
        int[] intArray = {20, 35 ,-15, 7 ,55, 1, -22, -100, 123,334};

        quickSort(intArray, 0, intArray.length);
        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {

        if(end - start < 2) {
            return;
        }

        //pivot
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        //traversal
        while (i < j) {
            //empty loop body
            //if its greater than pivot, we move the index to the left array
            while(i < j && input[--j] >= pivot);
            //if j has not crossed i
            if(i < j) {
                input[i] = input[j];
            }

            //empty loop body
            //if its les than the pivot, we move it to the right
            while(i < j && input[++i] <= pivot);

            if(i < j) {
                input[j] = input[i];
            }

        }
            //insert the pivod
            input[j] = pivot;
            return j;

    }
}
