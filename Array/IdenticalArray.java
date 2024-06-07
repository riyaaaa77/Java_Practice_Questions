
import java.util.Scanner;

public class IdenticalArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of 1st array : ");
        int size = sc.nextInt();

        int a[]  = new int[size]; 
        for(int i=0; i<a.length; i++)
        {
            System.out.print("Enter the " + i + " element of array : ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the size of 2nd array : ");
        int size2 = sc.nextInt();
        int b [] = new int[size2];
        for(int i=0;i<b.length;i++)
        {
            System.out.print("Enter the " + i + " element of array : ");
            b[i] = sc.nextInt();
        }
        boolean res = true;
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i] == b[i])
            {
                 res = true;
            }
            else{
                res = false;
            }
        }
        if(res)
        {
            System.out.println("Identical Array");
        }
        else
        {
            System.out.println("Not Identical Array");
        }
        sc.close();
    }
}
