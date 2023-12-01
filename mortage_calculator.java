package java_learning;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortage_calculator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the principle :");
        double principle = scanner.nextDouble();
        System.out.println("enter the annual intrest rate :");
        double intr_rate = scanner.nextDouble();
        System.out.println("enter the period(years) :");
        int period = scanner.nextInt();
        period = period*12;
        double mortage;
        intr_rate = intr_rate/100/12;
        mortage = principle*(intr_rate *Math.pow(1+intr_rate,period))/(Math.pow(1+intr_rate,period)-1);
        String currency = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println(currency);


        scanner.close();

    }
    
}
