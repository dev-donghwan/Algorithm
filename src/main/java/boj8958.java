import java.util.Scanner;

public class boj8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt()));
    }

    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
}
