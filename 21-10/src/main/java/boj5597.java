import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class boj5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] checker = IntStream.range(1, 31).toArray();
        for (int i = 0; i < 28; i++) {
            checker[sc.nextInt() - 1] = 0;
        }

        Arrays.stream(checker)
                .filter(x -> x > 0)
                .forEach(x -> System.out.println(x));
    }
}
