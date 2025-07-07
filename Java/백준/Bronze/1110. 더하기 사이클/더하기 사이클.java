import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = n;
        int cnt = 0;
        do {
            int tens = cur / 10;
            int ones = cur % 10;
            int sum = (tens + ones) % 10;
            cur = ones * 10 + sum;
            cnt++;
        } while (cur != n);
        System.out.println(cnt);
    }
}