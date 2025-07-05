import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = sc.next();
        String d = sc.next();
        int ua = u.length() - 1;
        int da = d.length() - 1;
        if (da <= ua)
            System.out.println("go");
        else
            System.out.println("no");
    }
}