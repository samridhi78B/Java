import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first array
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        // Read second array
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        int i = 0, j = 0;

        // Merge arrays using two pointers
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                System.out.println(arr1[i++]);
            } else {
                System.out.println(arr2[j++]);
            }
        }

        // Print remaining elements in arr1
        while (i < n) System.out.println(arr1[i++]);

        // Print remaining elements in arr2
        while (j < m) System.out.println(arr2[j++]);

        sc.close();
    }
}
