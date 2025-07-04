import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int a = 31;
        final int b = 1234567891;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String str = sc.next();
        long d = 0;
        long e = 1;
        for (int i = 0; i < c; i++) {
            int charValue = str.charAt(i) - 'a' + 1;
            d = (d + (charValue * e) % b) % b;
            e = (e * a) % b;
        }
        System.out.println(d);
    }
}