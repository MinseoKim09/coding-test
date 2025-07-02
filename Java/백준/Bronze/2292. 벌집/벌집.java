import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 1;
        int m = 1;

        while (n > m) {
            m += 6 * l;
            l++;
        }
        System.out.println(l);
    }
}