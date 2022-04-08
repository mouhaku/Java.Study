/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/5/ITP1_5_D
 */
package io.github.mouhaku.day03;

import java.util.Scanner;
import java.lang.*;


public class Demo02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {

                System.out.println(i);
            }
        }
    }
}

