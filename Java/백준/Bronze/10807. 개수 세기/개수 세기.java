import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nm = new int[n];
        for (int i = 0; i < n; i++)
            nm[i] = sc.nextInt();
        int v = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (nm[i] == v)
                c++;
        }
        System.out.println(c);
    }
}