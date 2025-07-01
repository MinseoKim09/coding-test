import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();

        boolean isPalindrome = true;

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) != w.charAt(w.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? 1 : 0);
    }
}