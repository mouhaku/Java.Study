public class Demo02
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = ++a;
        int c = a;
        System.out.println(a++);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}