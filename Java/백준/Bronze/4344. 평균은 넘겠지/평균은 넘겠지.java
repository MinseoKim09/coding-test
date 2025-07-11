import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] score = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = (double) sum / n;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (score[j] > avg)
                    cnt++;
            }
            double percent = (double) cnt / n * 100;
            System.out.printf("%.3f%%\n", percent);
        }
        sc.close();
    }
}