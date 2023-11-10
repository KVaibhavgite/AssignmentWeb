*//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

class ShufflesIt {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] rearrangedArray = rearrange(originalArray);
        int N = originalArray.length;

        System.out.print("Original Array: ");
        printArray(originalArray);

        // // Print the series
        // System.out.print("Series: ");
        // printPattern(N);

        System.out.print("Rearranged Array: ");
        printArray(rearrangedArray);
    }

    // Function to rearrange the array
    public static int[] rearrange(int[] array) {
        int[] result = new int[array.length];
        int evenIndex = 0;
        int oddIndex = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result[i] = array[evenIndex];
                evenIndex++;
            } else {
                result[i] = array[oddIndex];
                oddIndex--;
            }
        }

        return result;
    }

    // Function to print the series
    public static void printPattern(int N) {
        for (int i = 0; i < N; i++) {
            int index = (((i % 2 == 0) ? (i + 1) : (i - 1)));
            System.out.print(index + " ");
        }
        System.out.println();
    }

    // Function to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
