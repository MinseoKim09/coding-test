import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];
        
        for (int i = 0; i < N; i++)
            baskets[i] = i + 1;
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = baskets[i - 1];
            baskets[i - 1] = baskets[j - 1];
            baskets[j - 1] = temp;
        }
        for (int b : baskets) {
            System.out.print(b + " ");
        }
    }
}