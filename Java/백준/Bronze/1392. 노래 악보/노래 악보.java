import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] time = new int[N];
        int[] end = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = sc.nextInt();
            if (i == 0) {
                end[i] = time[i] - 1;
            } else {
                end[i] = end[i - 1] + time[i];
            }
        }
        for (int i = 0; i < Q; i++) {
            int T = sc.nextInt();
            for (int j = 0; j < N; j++) {
                if (T <= end[j]) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}