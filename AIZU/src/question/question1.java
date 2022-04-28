/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/JOI/Prelim/0582
 */
package question;

import java.util.Scanner;

public class question1 {
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public boolean judgeTriangle(int a, int b, int c)
    {
        if(a + b > c && a + c > b && b + c > a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int judgeTriangleType(int a, int b, int c)
    {
        //如果是锐角三角形则返回0；
        //如果是直角三角形则返回1；
        //如果是钝角三角形则返回2；
        //如果是等边三角形则返回3；
        //如果是等腰三角形则返回4；
        if(a * a < b * b + c * c && b * b < a * a + c * c && c * c < b * b + a * a)
        {
            return 0;
        } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a)
        {
            return 1;
        }
        else if(a * a > b * b + c * c || b * b > a * a + c * c || c * c > b * b + a * a)
        {
            return 2;
        }
        else if(a == b && b == c)
        {
            return 3;
        }
        else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a))
        {
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        question1 Triangle = new question1();
        int rj = 0;
        int zj = 0;
        int dj = 0;
        int db = 0;
        int dy = 0;
        int triangle = 0;
        while(true)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(Triangle.judgeTriangle(a,b,c))
            {
                triangle++;
                switch (Triangle.judgeTriangleType(a,b,c))
                {
                    case 0 :
                    {
                        rj++;
                        break;
                    }
                    case 1 :
                    {
                        zj++;
                        break;
                    }
                    case 2 :
                    {
                        dj++;
                        break;
                    }
                    case 3 :
                    {
                        db++;
                        break;
                    }
                    case 4 :
                    {
                        dy++;
                        break;
                    }
                }
            }
            else
            {
                break;
            }
        }
        System.out.println(triangle + " " + zj + " " + rj + " " + dj);
    }

}
