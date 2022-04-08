/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_A
 */
package io.github.mouhaku.day02;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a / b;
        int r = a % b;
        double f = (double) a / (double) b;
        System.out.println(d + " " + r + " " + String.format("%.8f", f));
    }
}

