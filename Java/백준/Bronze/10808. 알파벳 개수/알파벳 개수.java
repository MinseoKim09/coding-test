import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] cnt = new int[26];
        for (int  i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            cnt[c - 'a']++;
        }
        for (int i = 0; i < 26; i++)
            System.out.print(cnt[i] + " ");
    }
}