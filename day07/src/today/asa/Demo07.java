/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/9/ITP1_9_C
 */
package today.asa;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taro_score = 0;         //定义太郎的分数
        int hanako_score = 0;       //定义花子的分数
        for(int i = 0;i < n;i++)        //开始循环
        {
            String taro = sc.next();        //接收太郎的牌
            String hanako = sc.next();      //接收花子的牌
            if(taro.compareTo(hanako) > 0)
            {
                taro_score += 3;
            }
            else if(taro.compareTo(hanako) < 0)
            {
                hanako_score += 3;
            }
            else
            {
                taro_score++;
                hanako_score++;
            }
        }
        System.out.print(taro_score + " " +hanako_score);       //打印分数
        System.out.println();
    }
}
