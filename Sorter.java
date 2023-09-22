import java.util.Random;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        selectionSort(arr);

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }


        int array[] = new int[7];
        Random rand = new Random();

        for(int i = 0; i < 7; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.println("\n\nUnsorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        
        }

        sort(array);

        System.out.println("\nSorted array:");
        for (int value : array) {
            System.out.print(value + " ");
        
        }
        scanner.close();
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insetionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void sort(int array[]) {
        insetionSort(array);
    }
}
