import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            String[] num = line.split(",");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            System.out.println(a + b);
        }
    }
}