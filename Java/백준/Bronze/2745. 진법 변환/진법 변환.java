import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int a = sc.nextInt();
        int result = Integer.parseInt(n, a);
        System.out.println(result);
    }
}