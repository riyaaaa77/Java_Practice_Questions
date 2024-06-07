
import java.util.Scanner;

public class AverageInArray {
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
        int sum = 0;
        int avg = 0;
        for(int i = 0; i<a.length; i++)
        {
            sum += a[i];
            avg = sum/a.length;
        }
        System.out.println("The average of the array is : " + avg);
        sc.close();
    }
}
