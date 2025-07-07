import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[][] arr = new int[N][N];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = N / 2;
        int y = N / 2;
        int num = 1;
        arr[x][y] = num;
        int tx = x, ty = y;
        int len = 1;
        boolean done = false;
        while (!done) {
            for (int d = 0; d < 4; d++) {
                for (int i = 0; i < len; i++) {
                    x += dx[d];
                    y += dy[d];
                    if (x < 0 || x >= N || y < 0 || y >= N) {
                        done = true;
                        break;
                    }
                    num++;
                    arr[x][y] = num;

                    if (num == target) {
                        tx = x;
                        ty = y;
                    }

                    if (num == N * N) {
                        done = true;
                        break;
                    }
                }
                if (done) break;
                if (d % 2 == 1) len++;
            }
        }
        for (int[] row : arr) {
            for (int v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.println((tx + 1) + " " + (ty + 1));
    }
}