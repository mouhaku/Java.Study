/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/8/ITP1_8_A
 */
package today.asa;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0;i < str.length();i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                System.out.print((char)(str.charAt(i) + 32));
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                System.out.print((char)(str.charAt(i) - 32));
            }
            else
            {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}
