import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 0;
        int maxPeople = 0;
        for (int i = 0; i < 10; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            current = current - out + in;
            if (current > maxPeople)
                maxPeople = current;
        }
        System.out.println(maxPeople);
    }
}