import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next().toUpperCase();
        int[] c = new int[26];

        for (int i = 0; i < w.length(); i++)
            c[w.charAt(i) - 'A']++;
        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (c[i] > max) {
                max = c[i];
                result = (char) (i + 'A');
            } else if (c[i] == max)
                result = '?';
        }
        System.out.println(result);
    }
}