package J8;

public class Arr {
    public static void main(String[] args) {
        int a[] = {33, 3, 4, 5, 6, 9}; // Declaring and initializing an array
        
        // Call the method to find the 3rd maximum value
        int thirdMaxValue = thirdMax(a);

        // Print the 3rd maximum value
        System.out.println("3rd Maximum value: " + thirdMaxValue);
    }

    // Method to find the 3rd maximum value in an array
    public static int thirdMax(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least 3 elements");
        }

        // Initialize the first, second, and third maximum values
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        // Loop through the array to find the top 3 maximum values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != firstMax && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
        }

        return thirdMax;
    }
}
