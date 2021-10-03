import java.util.Arrays;
import java.util.Scanner;

public class boj20546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt();
        sc.nextLine();

        int[] price = Arrays.stream(sc.nextLine().split(" ")).mapToInt(x -> Integer.parseInt(x)).toArray();

        result(bnp(budget, price), timing(budget, price));
    }

    static void result(int bnp, int timing) {
        if (bnp > timing) {
            System.out.println("BNP");
        } else if (bnp < timing) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }

    static int bnp(int budget, int[] price) {
        int stock = 0;
        for (Integer i : price) {
            int possible = budget / i;
            if (possible > 0) {
                stock += possible;
                budget -= (possible * i);
            }
        }


        return budget + (stock * price[price.length - 1]);
    }

    static int timing(int budget, int[] price) {
        int upCount = 0;
        int downCount = 0;
        int timingBudget = budget;
        int stock = 0;

        for (int i = 0; i < price.length; i++) {
            int thisTurnPrice = price[i];
            if (i == 0) {
                upCount = 1;
                downCount = 1;
            } else {
                int compareValue = Integer.compare(price[i], price[i - 1]);
                if (compareValue > 0) {
                    upCount++;
                    downCount = 0;
                } else if (compareValue < 0) {
                    downCount++;
                    upCount = 0;
                } else {

                }
            }

            if (upCount == 3) {
                if (stock > 0) {
                    timingBudget += (stock * thisTurnPrice);
                    stock = 0;
                }
            }

            if (downCount == 3) {
                int possible = timingBudget / thisTurnPrice;
                if (possible > 0) {
                    stock += possible;
                    timingBudget -= possible * thisTurnPrice;
                }
            }
        }

        return timingBudget + (stock * price[price.length - 1]);
    }
}
