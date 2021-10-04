import java.util.Arrays;
import java.util.Scanner;

public class boj21918 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[] state = Arrays.stream(sc.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            switch (a) {
                case 1:
                    state[b - 1] = c;
                    break;
                case 2:
                    for (int j = b - 1; j < c; j++) {
                        state[j] = state[j] == 1 ? 0 : 1;
                    }
                    break;
                case 3:
                    for(int j = b - 1; j < c; j++) {
                        state[j] = 0;
                    }
                    break;
                case 4:
                    for(int j = b - 1; j < c; j++) {
                        state[j] = 1;
                    }
                    break;
            }
        }

        Arrays.stream(state).forEach(x -> System.out.print(x + " "));
    }
}
