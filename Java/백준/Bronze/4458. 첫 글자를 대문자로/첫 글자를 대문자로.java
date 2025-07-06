import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.length() > 0) {
                char firstchar = Character.toUpperCase(s.charAt(0));
                String rest = s.substring(1);
                System.out.println(firstchar + rest);
            }
            else
                System.out.println();
        }
    }
}