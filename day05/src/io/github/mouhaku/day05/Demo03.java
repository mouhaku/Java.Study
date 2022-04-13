/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/7/ITP1_7_B
 */
package io.github.mouhaku.day05;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        listNode input = getInput();
        // method();
        while(input != null){
            System.out.println(calcCnt(input));
            input = input.next;
        }
    }

    public static listNode getInput(){
        listNode out = new listNode();
        listNode befor = out;

        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 && x == 0) {
                break;
            } else {
                listNode newOne = new listNode();
                newOne.setX(n);
                newOne.setY(x);
                befor.next = newOne;
                befor = befor.next;
            }
        }
        return out.next;
    }

    private static int calcCnt(listNode node){

        int sum = 0;
        int n = node.getX();
        int x = node.getY();

        for(int i = 1;i <= n - 2;i++)
        {
            for(int j = i + 1;j <= n - 1;j++)
            {
                for(int k = j + 1;k <= n;k++)
                {
                    if((i + j + k) == x)
                    {
                        sum += 1;
                    }
                }
            }
        }
        return sum;
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int length = 100000;
        int[] sum = new int[length];
        while(true)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0)
            {
                break;
            }
            else
            {
                sum[length - 1] = 0;

                //System.out.println("length = "+ length);
                for(int i = 1;i <= n - 2;i++)
                {
                    for(int j = i + 1;j <= n - 1;j++)
                    {
                        for(int k = j + 1;k <= n;k++)
                        {
                            if((i + j + k) == x)
                            {
                                sum[length - 1] += 1;
                            }
                        }
                    }
                }
                ++length;
            }

        }
        for(int i = 0;i < (length - 1);i++)
        {
            System.out.println(sum[i]);
        }
    }
}
