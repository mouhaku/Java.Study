/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/3/ITP1_3_D
*/
package io.github.mouhaku.day01;
import java.util.Scanner;

public class Demo05
{
    public static void main(String[] args) {
        method();
    }
    public static void method()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int j = a;
        int i = 0;
        for(a = j;a <= b;a++)
        {
            if(c % a == 0)
                i++;
        }
        System.out.println(i);
    }
}

