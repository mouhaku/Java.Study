/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/PCK/Prelim/0278
 */
package challenge;

import java.util.Scanner;

public class nyujoryokin {
    public int saiyasu(int x ,int y , int b ,int p)
    {
        int sum1 = x * b + y * p;
        int b1 = Math.max(b,5);
        int p1 = Math.max(p,2);
        int sum2 = (x * b1 + y * p1) * 8 / 10;
        return Math.min(sum1,sum2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nyujoryokin saiyasu = new nyujoryokin();
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(saiyasu.saiyasu(scanner.nextInt(),scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
    }
}
