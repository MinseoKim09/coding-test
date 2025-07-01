import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int len = s.length();
            if (len == 1)
                System.out.println(s + s);
            else
                System.out.println("" + s.charAt(0) + s.charAt(len - 1));
        }
    }
}