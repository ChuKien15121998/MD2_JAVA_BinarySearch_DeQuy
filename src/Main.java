import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to find: ");
        int x = scanner.nextInt();
        int n = list.length;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(list, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
