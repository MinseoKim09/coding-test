import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a = a % 10;
            if (a == 0) {
                System.out.println(10);
                continue;
            }
            int r =  1;
            for (int j = 0; j < b; j++)
                r = (r * a) % 10;
            System.out.println(r);
        }
        sc.close();
    }
}