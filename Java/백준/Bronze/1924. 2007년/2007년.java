import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // month
        int y = sc.nextInt(); // day
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 
                           31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int totalDays = 0;
        for (int i = 1; i < x; i++) {
            totalDays += monthDays[i];
        }
        totalDays += y;
        System.out.println(week[totalDays % 7]);
    }
}