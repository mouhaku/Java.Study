/*
https://onlinejudge.u-aizu.ac.jp/courses/lesson/2/ITP1/9/ITP1_9_A
 */
package today.asa;
import java.util.Objects;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W1 = sc.next();
        String W = W1.toUpperCase();
        int l = W.length();//要对比的单词长度
        int sum2 = 0;//总计数
        String aa;

        while(!"END_OF_TEXT".equals(aa=sc.next()))
        {
            int L = aa.length();
            if(l != L){
                continue;
            }
                String tmp = aa.toUpperCase();

            int sum1 = 0;
            for(int i = 0;i < l;i++)
            {
                    if(tmp.charAt(i) == W.charAt(i))
                    {
                        sum1++;
                    }
            }
            if(sum1 == l)
            {
                sum2++;
            }
        }

        System.out.println(sum2);
    }
}
