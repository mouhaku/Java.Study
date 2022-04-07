/*
输入三个数，从小到大输出
*/

import java.util.Scanner;

public class Demo08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t;
        if(a > b)
        {
            t = a;a = b;b = t;
        }
//        System.out.println("a = " + a + "b = " + b);
        if(b > c)
        {
            t = b;b = c;c = t;
        }
//        System.out.println("b = " + b + "c = " + c);
        if(a > b)
        {
            t = a;a = b;b = t;
        }
        System.out.println(a + " " + b + " " + c);
    }
}