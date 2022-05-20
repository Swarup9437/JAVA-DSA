public class Sorting {
    public static void main(String[] args) {
        int [] arr = { 17, 26, 25, 8, 9, 11};
        //bubbleSort(arr, arr.length);
        //selectionSort(arr, arr.length);
        //insertionSort(arr, arr.length);
        //mergeSort(arr, 0, arr.length-1);
        quickSort(arr, 0, arr.length-1);
        for(int x: arr) System.out.print(x+" ");
    }
    public static void bubbleSort(int [] arr, int n){
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]) swap (arr, j , j+1);
            }
        }
    }
    public static void selectionSort(int[] arr, int n){
        for (int i = 0; i < n-1; i++){
            int smallest = i;
            for(int j = i+1; j < n; j++){
                if (arr[j] < arr[smallest]) smallest = j;
            }
            swap(arr, i, smallest);
        }
    }
    public static void insertionSort(int [] arr, int n){
        for (int i = 1; i < n; i++){
            int j = i-1;
            int current = arr[i];
            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
    public static void mergeSort(int [] arr, int start, int end){
        // divide and conquer
        if (start < end){
            int mid = start+(end-start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            conquer (arr, start, mid, end);
        }
    }
    public static void conquer(int [] arr, int start, int mid, int end){
        int [] merge = new int [end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;
        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]) merge[x++] = arr[idx1++];
            else merge[x++] = arr[idx2++];
        }
        while(idx1 <= mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2 <= end){
            merge[x++] = arr[idx2++];
        }
        for(int a: merge) arr[start++] = a;
    }
    public static void quickSort(int [] arr, int start, int end){
        if(start < end){
            int pivotIdx = pivot (arr, start, end);
            quickSort(arr, start, pivotIdx-1);
            quickSort(arr, pivotIdx+1, end);
        }
    }
    public static int pivot(int [] arr, int start, int end){
        int pivotElement = arr[end];
        int j = start -1;
        for (int i = start; i < end; i++){
            if (arr[i] < pivotElement){
                j++;
                swap (arr, i, j);
            }
        }
        j++;
        swap(arr, end, j);
        return j;
    }
    public static void swap(int [] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
