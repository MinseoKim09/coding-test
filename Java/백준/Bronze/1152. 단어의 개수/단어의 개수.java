import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().trim();

        if (line.isEmpty())
            System.out.println(0);
        else {
            String[] w = line.split("\\s+");
            System.out.println(w.length);
        }
    }
}