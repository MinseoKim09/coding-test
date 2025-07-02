import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int days = (c - a) / (a - b);

        if ((c - a) % (a - b) != 0)
            days++;
        System.out.println(days + 1);
    }
}