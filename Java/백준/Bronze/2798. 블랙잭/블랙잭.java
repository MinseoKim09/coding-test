import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++)
            c[i] = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = c[i] + c[j] + c[k];
                    if (sum <= m && sum > max)
                        max = sum;
                }
            }
        }
        System.out.println(max);
    }
}