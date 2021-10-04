import java.util.Scanner;

public class boj2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = (isMultiple(n, 4) && (!isMultiple(n, 100) || isMultiple(n, 400))) ? 1 : 0;
        System.out.println(result);
    }

    static boolean isMultiple(int targetNumber, int multipleNumber) {
        return targetNumber % multipleNumber == 0;
    }
}
