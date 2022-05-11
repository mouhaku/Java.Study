/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/1/ALDS1/1/ALDS1_1_D
 */
package ALDS1;

import java.util.Scanner;

public class ALDS1_1_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r0 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int max = r1 - r0;
        int min = Math.min(r0,r1);
        for (int i = 2; i < n; i++) {
            int r = scanner.nextInt();
            max = Math.max(max,r - min);
            min = Math.min(min,r);
        }
        System.out.println(max);
    }
}
