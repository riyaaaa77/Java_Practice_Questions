
import java.util.Scanner;

public class CubeElement {
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
        int cube;
        for(int i = 0; i<a.length; i++)
        {
            cube = a[i]*a[i]*a[i];
            System.out.println("The cube of " + a[i] + " is " + cube);
        }
        sc.close();
    }  
}
