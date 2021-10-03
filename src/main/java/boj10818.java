import java.util.Arrays;
import java.util.Scanner;

public class boj10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] line = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(x -> Integer.parseInt(x)).toArray();

        System.out.print(Arrays.stream(line).min().getAsInt() + " ");
        System.out.print(Arrays.stream(line).max().getAsInt());
    }
}
