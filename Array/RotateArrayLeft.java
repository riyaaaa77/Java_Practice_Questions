
public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 2; // Number of positions to rotate left

        System.out.println("Original Array:");
        printArray(array);

        rotateLeft(array, n);

        System.out.println("Array after rotating left by " + n + " positions:");
        printArray(array);
    }

    public static void rotateLeft(int[] array, int n) {
        int length = array.length;
        n = n % length; // Adjust n to handle cases where n is larger than the array length

        for (int i = 0; i < n; i++) {
            int temp = array[0];
            for (int j = 0; j < length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[length - 1] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
