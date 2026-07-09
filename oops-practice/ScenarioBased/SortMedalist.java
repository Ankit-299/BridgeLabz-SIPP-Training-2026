// A sports meet has 50 athletes with scores. Sort using Bubble Sort, count total swaps, and flag if already sorted (best case).
//  Repeat with Insertion Sort and Selection Sort. Find top-3 medalists. Trace pass-by-pass changes on
// array [64, 25, 12, 22, 11, 45, 23, 44, 56, 56].
public class SortMedalist {
    public static void main(String[] args) {
        int[] scores = {64, 25, 12, 22, 11, 45, 23, 44, 56, 56};
        System.out.println("Original Scores: ");
        printArray(scores);

        // Bubble Sort
        System.out.println("\nBubble Sort:");
        bubbleSort(scores.clone());

        // Insertion Sort
        System.out.println("\nInsertion Sort:");
        insertionSort(scores.clone());

        // Selection Sort
        System.out.println("\nSelection Sort:");
        selectionSort(scores.clone());

        // Find top-3 medalists
        System.out.println("\nTop-3 Medalists:");
        findTopMedalists(scores);
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
            if (!swapped) {
                System.out.println("Already sorted at pass " + (i + 1));
                break;
            }
        }
        System.out.println("Total swaps: " + swapCount);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        int shiftCount = 0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                shiftCount++;
            }
            arr[j + 1] = key;
            System.out.print("Pass " + i + ": ");
            printArray(arr);
        }
        System.out.println("Total shifts: " + shiftCount);
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
        System.out.println("Total swaps: " + swapCount);
    }

    private static void findTopMedalists(int[] arr) {
        int[] copy = arr.clone();
        selectionSort(copy);
        int count = Math.min(3, copy.length);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " -> " + copy[copy.length - 1 - i]);
        }
    }
}
