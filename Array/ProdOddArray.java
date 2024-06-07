
import java.util.Scanner;

public class ProdOddArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int a [] = new int[size];
        for(int i = 0; i<a.length ; i++)
        {
            System.out.print("Enter the " + i + " element of array : ");
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<a.length ; i++)
        {
            System.out.println ( "The array elemnt at "+ i+  " is " + a[i]);
        }
        int prod = 1;
        for(int i = 0; i<a.length ; i++)
        {
           if(i%2!=0) 
           {
            prod *= a[i];
           }
        }
        System.out.println("The product of odd idex element is :" + prod);
        sc.close();
    }
}
