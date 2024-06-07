
import java.util.Scanner;
public class ReverseArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int a [] = new int[size];
        for(int i = 0; i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<a.length ; i++)
        {
            System.out.println ( "The original array elemnt "+ i+  " is " + a[i]);
        }
        System.out.println();
        int s = 0, e = a.length-1;
        while(s<=e)
        {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
        for(int i = 0; i<a.length; i++)
        {
            System.out.println("The reversed array elemnt "+ i+ " is " + a[i]);
        }
        sc.close();
    }
}
