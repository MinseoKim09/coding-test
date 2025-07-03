import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            int sum = 0;
            ArrayList<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                    divisors.add(i);
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}