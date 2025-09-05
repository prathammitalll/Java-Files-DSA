import java.util.Arrays;
import java.util.Collections;

public class sortingAlgorithm {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int turn = 0; turn < n-1; turn++) {
            for (int j = 0; j < n-1-turn; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            //finding the right position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void inbuiltSort(int arr[]) {
        // import java.util.Arrays;
        Arrays.sort(arr);
        Arrays.sort(arr, 0, 3);
    }

    public static void inBuiltReverseSort(Integer arr[]) {
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        // countingSort(arr);
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
