/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/3/ITP1_3_C
*/
package io.github.mouhaku.day01;
import java.util.Scanner;

public class Demo04
{
    public static void main(String[] args)
    {
        method();
    }
    public static void method()
    {
        Scanner sc = new Scanner(System.in);
        int t;
        while(true)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0)
                break;
            else if (a > b) {
                t = a;
                a = b;
                b = t;
            }
            System.out.println(a + " " + b);

        }
    }
}
