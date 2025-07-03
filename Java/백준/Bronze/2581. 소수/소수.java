import java.util.Scanner;

public class Main {
    public static boolean isprime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= Math.sqrt(n); i++)
        if (n % i == 0) return false;
    return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {
            if (isprime(i)) {
                sum += i;
                if (i < min) min = i;
            }
        }
        if (sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}