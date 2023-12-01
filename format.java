package java_learning;

import java.text.NumberFormat;

public class format
{
    public static void main(String[] args)
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(123456.235);
        System.out.println(result1);
        NumberFormat perc = NumberFormat.getPercentInstance();
        String result2 = perc.format(0.98);
        System.out.println(result2);
    }
    
}
