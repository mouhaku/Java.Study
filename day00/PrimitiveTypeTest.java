public class PrimitiveTypeTest {
    public static void main(String[] args) {
    // byte
    System.out.println("基本?型：byte 二?制位数：" + Byte.SIZE);
    System.out.println("包装?：java.lang.Byte");
    System.out.println("最小?：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
    System.out.println("最大?：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
    System.out.println();
    
    // short
    System.out.println("基本?型：short 二?制位数：" + Short.SIZE);
    System.out.println("包装?：java.lang.Short");
    System.out.println("最小?：Short.MIN_VALUE=" + Short.MIN_VALUE);
    System.out.println("最大?：Short.MAX_VALUE=" + Short.MAX_VALUE);
    System.out.println();

    // int
    System.out.println("基本?型：int 二?制位数：" + Integer.SIZE);
    System.out.println("包装?：java.lang.Integer");
    System.out.println("最小?：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
    System.out.println("最大?：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
    System.out.println();

    // long
    System.out.println("基本?型：long 二?制位数：" + Long.SIZE);
    System.out.println("包装?：java.lang.Long");
    System.out.println("最小?：Long.MIN_VALUE=" + Long.MIN_VALUE);
    System.out.println("最大?：Long.MAX_VALUE=" + Long.MAX_VALUE);
    System.out.println();

    // float
    System.out.println("基本?型：float 二?制位数：" + Float.SIZE);
    System.out.println("包装?：java.lang.Float");
    System.out.println("最小?：Float.MIN_VALUE=" + Float.MIN_VALUE);
    System.out.println("最大?：Float.MAX_VALUE=" + Float.MAX_VALUE);
    System.out.println();

    // double
    System.out.println("基本?型：double 二?制位数：" + Double.SIZE);
    System.out.println("包装?：java.lang.Double");
    System.out.println("最小?：Double.MIN_VALUE=" + Double.MIN_VALUE);
    System.out.println("最大?：Double.MAX_VALUE=" + Double.MAX_VALUE);
    System.out.println();

    // char
    System.out.println("基本?型：char 二?制位数：" + Character.SIZE);
    System.out.println("包装?：java.lang.Character");
    // 以数?形式而不是字符形式将Character.MIN_VALUE?出到控制台
    System.out.println("最小?：Character.MIN_VALUE="
            + (int) Character.MIN_VALUE);
    // 以数?形式而不是字符形式将Character.MAX_VALUE?出到控制台
    System.out.println("最大?：Character.MAX_VALUE="
            + (int) Character.MAX_VALUE);
}
}  