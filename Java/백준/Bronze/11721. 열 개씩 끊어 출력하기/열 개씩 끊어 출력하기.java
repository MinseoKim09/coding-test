import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}