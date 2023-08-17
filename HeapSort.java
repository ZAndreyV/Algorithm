public class HeapSort {
    public static void main(String[] args) {
        int[] array1 = new int[] {4, 5, 8, 2, 5, 7, 9, 1, 2, 3};
        sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    private static void hearfy(int[] arr, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < heapSize && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            hearfy(arr, heapSize, largest);
        }
    }

    public static void sort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0 ; i--) {
            hearfy(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            hearfy(arr, i, 0);

        }
    }
}
