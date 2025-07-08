import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = a * b * c;
        int[] cnt = new int[10];
        String str = String.valueOf(r);
        for (int i = 0; i < str.length(); i++) {
            int d = str.charAt(i) - '0';
            cnt[d]++;
        }
        for (int i = 0; i < 10; i++)
            System.out.println(cnt[i]);
    }
}