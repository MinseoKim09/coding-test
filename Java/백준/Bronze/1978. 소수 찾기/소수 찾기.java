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
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (isprime(a))
                c++;
        }
            System.out.println(c);
    }
}