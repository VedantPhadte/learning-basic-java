import java.util.Scanner;
public class linear 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n,mid,high,low,key;
        System.out.println("enter the size of array");
        n = s.nextInt();
      
        int a[] = new int[n];
        System.out.println("enter the elements in ascending order");
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("enter the value to be searched");
        key = s.nextInt();

        high = n;
        low = 0;
        mid = (low+high)/2;
        while(high>low)
        {
            if(key > a[mid])
            {
                low = mid+1;
                mid = (low + high)/2;
            }
            if(key < a[mid])
            {
                high = mid-1;
                mid = (low + high)/2;
            }
            if(key == a[mid])
            {
                System.out.println("element found at index "+(mid+1));
                break;
            }
        }
        s.close();
    }
    
}
