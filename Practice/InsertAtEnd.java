import java.util.Arrays;

public class InsertAtEnd {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int newElement = 60; 
        int newSize = arr.length + 1;
        int[] newArr = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newSize - 1] = newElement;
        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}

