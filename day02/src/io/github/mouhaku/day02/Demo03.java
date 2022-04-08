/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/4/ITP1_4_C
 */
package io.github.mouhaku.day02;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            char op = sc.next().charAt(0);//读取输入的字符串中的第一个字符
            int b = sc.nextInt();
            if (b == 0 && op == '/')
                break;
            if (op == '+') {
                System.out.println(a + b);
            }
            if (op == '-') {
                System.out.println(a - b);
            }
            if (op == '*') {
                System.out.println(a * b);
            }
            if (op == '/') {
                System.out.println(a / b);
            }
            if(op == '?')
                break;
        }
    }
}

