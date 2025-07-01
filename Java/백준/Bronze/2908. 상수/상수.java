import java.util.Scanner;

public class Main {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int reverseda = Integer.parseInt(reverse(a));
        int reversedb = Integer.parseInt(reverse(b));

        System.out.println(Math.max(reverseda, reversedb));
    }
}