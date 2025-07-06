import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            long c1 = 2 * a - b;
            long c2 = a + b;
            long c3 = 2 * a - b;
            long minc = Math.min(c1, Math.min(c2, c3));
            System.out.println(minc);
        }
    }
}