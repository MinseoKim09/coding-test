import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minBurger = Math.min(sc.nextInt(), Math.min(sc.nextInt(), sc.nextInt()));
        int minDrink = Math.min(sc.nextInt(), sc.nextInt());
        System.out.println(minBurger + minDrink - 50);
    }
}