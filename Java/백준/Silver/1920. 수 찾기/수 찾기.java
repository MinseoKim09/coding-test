import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean binarySearch(int[] a, int target) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int min = (l + r) / 2;
            if (a[min] == target)
                return true;
            else if (a[min] < target)
                l = min + 1;
            else
                r = min - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();
            if (binarySearch(a, target))
                System.out.println(1);
            else
                System.out.println(0);
        }
        sc.close();
    }
}