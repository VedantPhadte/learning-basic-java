package java_learning;
import java.util.Scanner;
public class strings 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String mesg;
        mesg = s.next();
        System.out.println(mesg);
        System.out.println(mesg.replace("h", "k"));
        System.out.println("hello \"world\"");
        System.out.println("c:\\data");
        s.close();
    }
}
