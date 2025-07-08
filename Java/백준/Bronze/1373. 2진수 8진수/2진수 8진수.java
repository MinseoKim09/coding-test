import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        int pad = (3 - (binary.length() % 3 )) % 3;
        for (int i = 0; i < pad; i++)
            binary = "0" + binary;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 3) {
            String triplet = binary.substring(i, i + 3);
            int oct = Integer.parseInt(triplet, 2);
            sb.append(oct);
        }
        if (sb.toString().replaceAll("0", "").isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(sb.toString());
        }
    }
}