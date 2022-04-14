/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/8/ITP1_8_B
 */
package today.asa;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String num = sc.next();
            if(num.charAt(0) == '0')
            {
                break;
            }
            else
            {
                int sum = 0;
                for(int i = 0;i < num.length();i++)
                {
                    sum += num.charAt(i) - '0';
                }
                System.out.println(sum);
            }
        }
    }
}
