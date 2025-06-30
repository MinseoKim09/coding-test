import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N]; 

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); 
            int j = sc.nextInt(); 
            int k = sc.nextInt(); 
            for (int idx = i - 1; idx <= j - 1; idx++) {
                baskets[idx] = k;
            }
        }
        for (int b : baskets) {
            System.out.print(b + " ");
        }
    }
}