import java.util.Scanner;

public class switchcalc 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 2 numbers ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("1>sum  2>sub");
        int x = s.nextInt();
        switch(x)
        {
            case 1 : System.out.println(a+b);
                     break;
            case 2 : System.out.println(a-b);
                     break;
            default:System.out.println("error");
                     break;
        }
        s.close();
    }
    
}
