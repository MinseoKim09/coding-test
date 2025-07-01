import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] co = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int cur = sc.nextInt();
            System.out.print((co[i] - cur) + " ");
        }
    }
}