import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[3];
        for (int i = 0; i < 3; i++)
            s[i] = sc.nextInt();
        Arrays.sort(s);
        if (s[0] + s[1] > s[2])
            System.out.println(s[0] + s[1] + s[2]);
        else {
            int mV = s[0] + s[1] - 1;
            System.out.println(s[0] + s[1] + mV);
        }
    }
}