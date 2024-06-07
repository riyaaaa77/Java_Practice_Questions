
import java.util.Scanner;

public class MaxElementArray {
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
        int max = a[0];
        for(int i =0; i<a.length; i++)
        {
            if(a[i] > max )
            {
                max = a[i];
            }
        }
        System.out.println("The max num in the array is : " + max);
        sc.close();
    }
}
