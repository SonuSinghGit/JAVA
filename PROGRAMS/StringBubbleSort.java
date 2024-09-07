public class StringBubbleSort {
    public static void main(String[] args) {
        String inputString = "sonu";
        char[] charArray = inputString.toCharArray();

        // Applying Bubble Sort
        int n = charArray.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swapping elements
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swapping occurs in inner loop, array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Constructing sorted string
        String sortedString = new String(charArray);
        System.out.println("Sorted string in ascending order: " + sortedString);
    }
}