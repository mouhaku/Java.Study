/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/JOI/Prelim/0630
 */
package io.github.mouhaku.day03;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int s;

        if(a < 0)
        {
            s = (-a) * c + d + b * e;
        }
        else if(a == 0)
        {
            s = c * d + b * e;
        }
        else
        {
            s = (b - a) * e;
        }
        System.out.println(s);
    }
}
