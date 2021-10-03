import java.util.Scanner;

public class boj8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int result = 0;
            int score = 0;
            for (String str : line.split("")) {
                if (str.equals("O")) {
                    score += 1;
                } else {
                    score = 0;
                }
                result += score;
            }
            System.out.println(result);
        }
    }
}
