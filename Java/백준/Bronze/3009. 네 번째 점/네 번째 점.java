import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int fX, fY;
        if (x[0] == x[1]) fX = x[2];
        else if (x[0] == x[2]) fX = x[1];
        else fX = x[0];

        if (y[0] == y[1]) fY = y[2];
        else if (y[0] == y[2]) fY = y[1];
        else fY = y[0];
        System.out.println(fX + " " + fY);
    }
}