/*
输出1-100之间偶数和
*/
public class Demo06
{
    public static void main(String[] args)
    {
        int n = 0;
        for(int i = 1;i <= 100;i++)
        {
            n+=i;
        }
        System.out.println("1-100之間偶数和是:"+ n);
    }
}