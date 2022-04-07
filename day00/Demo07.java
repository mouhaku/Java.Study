import java.util.Scanner;

public class Demo07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a < 0 || b < 0 || c < 0 || a > 100 || b >100 || c >100)
        {
            System.out.println("data error");
        }
        else
        {
            if(b > a && b < c)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}