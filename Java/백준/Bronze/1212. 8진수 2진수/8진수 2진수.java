import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String octal = br.readLine();
        if (octal.equals("0")) {
            System.out.println("0");
            return;
        }
        StringBuilder binary = new StringBuilder();
        int first = octal.charAt(0) - '0';
        binary.append(Integer.toBinaryString(first));
        for (int i = 1; i < octal.length(); i++) {
            int num = octal.charAt(i) - '0';
            String bin = Integer.toBinaryString(num);
            while (bin.length() < 3) {
                bin = "0" + bin;
            }
            binary.append(bin);
        }
        System.out.println(binary);
    }
}