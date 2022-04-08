/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_B
 */
package io.github.mouhaku.day02;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.141592653589;
        double S = pi * r * r;
        double L = 2 * pi * r;
        System.out.println(String.format("%.6f", S) + " " + String.format("%.6f",L));
    }
}
