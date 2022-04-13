/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/JOI/Prelim/0619
 */
package io.github.mouhaku.day05;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int[] obj = new int[4];
        for(int i = 0;i < 4;i++)
        {
            obj[i] = sc.nextInt();
        }
        int tmp;
        for(int i = 0;i < 3;i++)
        {
            for(int j = 0;j < (3 - i);j++)
            {
                if(obj[j] < obj[j + 1])
                {
                    tmp = obj[j];
                    obj[j] = obj[j + 1];
                    obj[j + 1] = tmp;
                }
            }
        }
        int sum = 0;
        for(int i = 0;i < 3;i++)
        {
            sum += obj[i];
        }
        int e = sc.nextInt();
        int f = sc.nextInt();
        if(e > f)
        {
            System.out.println(e + sum);
        }
        else
        {
            System.out.println(f + sum);
        }
    }
}
