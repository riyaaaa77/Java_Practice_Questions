
import java.util.Scanner;
public class ArrayInsideArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int arr [] = new int[size];
        for(int i = 0; i<arr.length ; i++)
        {
            System.out.print("Enter the " + i + " element :"); 
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length; i++)
        {
            System.out.println("The elements of arr : " + arr[i]);
        }
        int [] b = new int[arr.length];
        for(int i =0 ; i<arr.length; i++)
        {
            b[i] = arr[i];
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println("The elemnets of b :" + b[i]);
        }
        sc.close();
    }
}
