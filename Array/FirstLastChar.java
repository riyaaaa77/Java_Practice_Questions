
import java.util.Scanner;

public class FirstLastChar {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        char a [] = new char[size];
        for(int i = 0; i<a.length ; i++)
        {
            a[i] = sc.next().charAt(0);
        }
        for(int i = 0; i<a.length ; i++)
        {
            System.out.println ( "The array elemnt "+ i+  " is " + a[i]);
        }
        for(int i = 0; i<a.length;i++)
        {
            if(  i == 0)
            {
                System.out.println ( "The first char in the array is : " + a[i]);
            }
            else if( i== a.length-1)
            {
                System.out.println ( "The last char in the array is : " + a[i]);
            }
        }
        sc.close();
    }
}
