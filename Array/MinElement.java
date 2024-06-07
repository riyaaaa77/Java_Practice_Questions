
import java.util.Scanner;
public class MinElement {
     public static void main(String [] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of 1st array : ");
    int size = sc.nextInt();

    int a[]  = new int[size]; 
    for(int i=0; i<a.length; i++)
    {
        System.out.print("Enter the " + i + " element of array : ");
        a[i] = sc.nextInt();
    }
    int min = a[0];
    for(int i =0; i<a.length; i++)
    {
        if(a[i] < min )
        {
            min = a[i];
        }
    }
    System.out.println("The min num in the array is : " + min);
    sc.close();
}
}
