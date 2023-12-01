package java_learning;

import java.util.Iterator;
import java.util.Vector;

public class vectors 
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<Integer>();
        v.add(12);
        v.add(1);
        Iterator<Integer> i = v.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next() + " ");
        }
    }
    
}
