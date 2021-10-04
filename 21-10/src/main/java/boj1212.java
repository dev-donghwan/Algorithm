import java.util.Scanner;
import java.util.Arrays;

public class boj1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split("")).mapToInt(x -> Integer.parseInt(x)).toArray();
        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuffer buffer = new StringBuffer();

        for (Integer n : numbers) {
            buffer.append(binary[n]);
        }

        while (buffer.toString().length() > 1 && buffer.toString().startsWith("0")) {
            buffer.deleteCharAt(0);
        }

        System.out.println(buffer);
    }
}
