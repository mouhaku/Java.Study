/**
 * https://onlinejudge.u-aizu.ac.jp/courses/lesson/9/INFO1/12/INFO1_12_E
 */

import java.util.HashSet;
import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int N = sc.nextInt();

        HashSet<String> points = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            points.add(x + "," + y + "," + z);
        }

        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (points.contains(x + "," + y + "," + z)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}