/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/2/ITP1_2_D
 */
package io.github.mouhaku.day01;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if( (x + r) <= W && (x - r) >= 0 && (y + r) <= H && (y - r) >= 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
