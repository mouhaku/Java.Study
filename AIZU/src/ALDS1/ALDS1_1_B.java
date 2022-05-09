/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/1/ALDS1/1/ALDS1_1_B
 */
package ALDS1;

import java.util.Scanner;

public class ALDS1_1_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while(x != y) {
            if (x > y) {
                x = x - y;
            } else if (x < y) {
                y = y - x;
            }
        }
        System.out.println(x);
    }
}

