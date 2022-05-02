/*
https://onlinejudge.u-aizu.ac.jp/challenges/sources/JOI/Prelim/0588
 */
package challenge;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        int sum = 0;
        switch (ch)
        {
            case '+' :
            {
                sum = num1 + num2;
                break;
            }
            case '-' :
            {
                sum = num1 - num2;
                break;
            }
            case '*' :
            {
                sum = num1 * num2;
                break;
            }
            case '/' :
            {
                sum = num1 / num2;
            }
        }
        while(true)
        {
            char ch1 = scanner.next().charAt(0);
            if(ch1 == '=')
            {
                System.out.println(sum);
                return;
            }
            int num = scanner.nextInt();
            switch (ch1)
            {
                case '+' :
                {
                    sum = sum + num;
                    break;
                }
                case '-' :
                {
                    sum = sum - num;
                    break;
                }
                case '*' :
                {
                    sum = sum * num;
                    break;
                }
                case '/' :
                {
                    sum = sum / num;
                }
            }
        }
    }
}
