import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++)
            c[i] = sc.nextInt();
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (c[i] <= k) {
                cnt += k / c[i];
                k %= c[i];
            }
        }
        System.out.println(cnt);
    }
}