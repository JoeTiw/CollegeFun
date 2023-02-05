import java.util.Random;

class BubbleSort {
    public static void main(String[]
                                    args) {

        Random rnd = new Random(); //create a random number generator object
        int[] arr = new int[10000]; //create an array called arr that generates 10000 random numbers in an array

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }

        //Time to call the ascending

        long start = System.nanoTime(); //start the timer
        System.out.println("Ascending order:"); //print the array in ascending order
        bubbleSort(arr, 10000, true); //call the ascending method
        long end = System.nanoTime(); // end the timer
        long time_taken = end - start; //calculate the time taken to execute the ascending method
        System.out.println();
        System.out.println("Execution time for Ascending sort: " + time_taken + " ns"); //print the time taken to execute the ascending method
        System.out.println();


        //Time to call the descending method
        start = System.nanoTime();
        System.out.println("Descending order:");
        bubbleSort(arr, 10000, false);
        end = System.nanoTime();
        time_taken = end - start;
        System.out.println();
        System.out.println("Execution time for Descending sort: " + time_taken + " ns");

    }

    public static void bubbleSort(int[] arr, int size, boolean ascending) {
        for (int i = 0; i < size - 1; i++) {           //loop through the array
            for (int j = 0; j < size - i - 1; j++) {
                if((ascending && arr[j] > arr[j+1]) || (!ascending && arr[j] < arr[j+1])){  //if the current element is greater than the next element when ascending and less than the next element when descending
                    swap(arr, j, j+1);             //swap the elements
                }
            }
        }
        //print the first 6 elements of the array
        for (int j = 0; j < size; j++) {
            if (j < 6) {
                System.out.print(arr[j] + " ");
            } else {
                System.out.print(".....");
                break;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];          //store the current element in a temporary variable
        arr[i] = arr[j];           //set the current element to the next element
        arr[j] = temp;              //set the next element to the current element
    }
}
