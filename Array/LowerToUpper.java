
import java.util.Scanner;

public class LowerToUpper {
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
            if(  a[i] >= 'a' && a[i] <= 'z')
            {
                a[i] = (char)(a[i] - 32);
                System.out.println ( "The array " + i + "elemnt in UpperCase is " + a[i]);
            }
        }
        sc.close();
    }
}
