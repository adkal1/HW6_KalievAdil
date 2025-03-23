package lesson_7;

public class ShiftArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        printArray(arr);
        shiftArray(arr, 1);
        printArray(arr);


    }
    public static void shiftArray(int[] arr, int n) {
        int len = arr.length;
        n = n % len;
        if (n < 0) {
            n += len;
        }
        for (int i = 0; i < n; i++) {
            int temp = arr[len - 1];
            for (int j = len - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
