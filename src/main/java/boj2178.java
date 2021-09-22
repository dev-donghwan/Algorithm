import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj2178 {
    private static ArrayList<ArrayList<Integer>> map = new ArrayList<>();
    private static boolean[][] visited;
    private static int n;
    private static int m;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            map.add(new ArrayList<>());
            for (char ch : sc.nextLine().toCharArray()) {
                map.get(i).add(ch - '0');
            }
        }

        bfs(0, 0);

        System.out.println(map.get(n - 1).get(m - 1));
    }

    private static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Point point = q.poll();
            for (int i = 0; i < dx.length; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }

                if (visited[nextX][nextY] || map.get(nextX).get(nextY) == 0) {
                    continue;
                }

                map.get(nextX).set(nextY, map.get(point.x).get(point.y) + 1);
                q.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;
            }
        }
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
