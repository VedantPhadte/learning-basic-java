package java_learning;

public class Casting 
{
    public static void main(String[] args)
    {
        double res = (double) 10 / 3;
        int x = 1;
        int a = 1;
        int y = x++;
        int z = ++a;
        int b = 1;
        b += 2;
        System.out.println(res);
        System.out.println(x);
        System.out.println(y+" "+z);
        System.out.println(b);

        //implicit casting
        short var1 = 1;
        int var2 = var1 + 1;
        System.out.println("var2 = "+var2);

        //explicit casting
        double var3 = 1.5;
        int var4 = (int)var3 + 2;
        System.out.println(var4);

        String m = "1";
        int var5 = Integer.parseInt(m) + 2;
        System.out.println(var5);

        String n = "1.5";
        int var6 = (int)Double.parseDouble(n) + 2;
        System.out.println(var6);
    }
}
