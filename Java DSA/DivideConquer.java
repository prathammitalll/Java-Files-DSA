public class DivideConquer {
    public static void mergeSort(int arr[], int si, int ei) {
        if (si>=ei) {
         return;   
        }

        int mid = si + (ei - si)/2; // More optimized version of (si+ei)/2 

        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei ) {
        // left(0,3)=4elements right(4,6)=3elements -> 6-0+1
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++; k++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        // right part 

        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array 
        for (k=0; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si>=ei) return;

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); // left
        quickSort(arr, pIdx+1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller than pivot

        for (int j=si; j<ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
        
    }

    public static void searchInRotatedArray(int arr[], int target) {
        
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        // mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
