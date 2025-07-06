import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            boolean[] seen = new boolean[26];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                seen[c - 'A'] = true;
            }
            int sum = 0;
            for (int j = 0; j < 26; j++) {
                if (!seen[j])
                    sum += ('A' + j);
            }
            System.out.println(sum);
        }
    }
}