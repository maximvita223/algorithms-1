public class HeapSort {
    public void sort(int arr[]) {
        int size = arr.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arr, size, i);

        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int size, int index) {
        int largest = index; 
        int left = 2 * index + 1; 
        int right = 2 * index + 2; 

        if (left < size && arr[left] > arr[largest])
            largest = left;


        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != index) {
            int swap = arr[index];
            arr[index] = arr[largest];
            arr[largest] = swap;

            heapify(arr, size, largest);
        }
    }

    static void printArray(int arr[]) {
        int size = arr.length;
        for (int index = 0; index < size; ++index)
            System.out.print(arr[index] + " ");
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = { 1,2,4,2,2,3,12,3,4,13,4,1,3,1,1,7,1,41};

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }
}
