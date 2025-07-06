import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] num = new String[n];
        for (int i = 0; i < n; i++)
            num[i] = sc.next();
        Arrays.sort(num, (a, b) -> (b + a).compareTo(a + b));
        if (num[0].equals("0"))
            System.out.println("0");
        else {
            StringBuilder sb =new StringBuilder();
            for (String s : num)
                sb.append(s);
            System.out.println(sb.toString());
        }
    }
}