import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aWin = 0;
        int bWin = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                aWin++;
            } else if (b > a) {
                bWin++;
            }
        }
        System.out.println(aWin + " " + bWin);
    }
}