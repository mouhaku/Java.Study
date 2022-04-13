/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/7/ITP1_7_A
 */
package io.github.mouhaku.day05;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        char[] student = new char[50];
        for(int i = 0;i < 50;i++)
        {
            student[i] = '0';
        }
        for(int i = 0;i < 50;i++)
        {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if(m == -1 && f == -1 && r == -1)
            {
                break;
            }
            else
            {
                if(m == -1 || f == -1 || (m + f) < 30)
                {
                    student[i] = 'F';
                }
                else if((m + f) >= 80)
                {
                    student[i] = 'A';
                }
                else if((m + f) < 80 && (m + f) >= 65)
                {
                    student[i] = 'B';
                }
                else if((m + f) < 65 && (m + f) >= 50)
                {
                    student[i] = 'C';
                }
                else if((m + f) < 50 && (m + f) >= 30 && r >= 50)
                {
                    student[i] = 'C';
                }
                else if((m + f) < 50 && (m + f) >= 30 && r < 50)
                {
                    student[i] = 'D';
                }
            }
        }
        int i = 0;
        while(student[i] != '0')
        {
            System.out.println(student[i]);
            i++;
        }
    }
}
