package java_learning;

import java.awt.Point;

public class ref2 
{
    public static void main(String[] args)
    {
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 5;
        System.out.println(point2);
    }
    
}
