import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = false;
        for (int i = 1; i <= 5; i++) {
            String line = sc.nextLine();
            if (line.contains("FBI")) {
                System.out.print(i + " ");
                f = true;
            }
        }
        if (!f)
            System.out.println("HE GOT AWAY!");
    }
}