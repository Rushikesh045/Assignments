import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);
		
        System.out.print("Array with duplicates removed: ");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i]);
            if (i < uniqueArray.length - 1) {
                System.out.print(", ");
            }
        }
    }

 static int[] removeDuplicates(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        Arrays.sort(arr);

        int[] uniqueArray = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArray[j++] = arr[i];
            }
        }
        uniqueArray[j++] = arr[arr.length - 1];

        int[] finalArray = new int[j];
        for (int i = 0; i < j; i++) {
            finalArray[i] = uniqueArray[i];
        }
        return finalArray;
    }
}
