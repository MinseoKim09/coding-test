import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = new String[n];
        for (int i =0; i < n; i++)
            s[i] = sc.nextLine();
        int l = s[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            char c = s[0].charAt(i);
            boolean a = true;
            for (int j = 1; j < n; j++) {
                if (s[j].charAt(i) != c) {
                    a = false;
                    break;
                }
            }
            if (a)
                sb.append(c);
            else
                sb.append('?');
        }
        System.out.println(sb);
    }
}