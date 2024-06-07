import java.util.Scanner;

public class RotateToLeft {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int a [] = new int[size];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i<a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The elements of the original array are : ");
        for(int i = 0; i<a.length ; i++)
        {
            System.out.print (a[i] + " ");
        }
        System.out.println();
        int x = a[a.length-1];
        System.out.println("Enter the value of rotation (n) : ");
        int n = sc.nextInt();
        for(int j = 1; j<=n ; j++){
        for(int i = a.length-1; i!=0; i--)
        {
            a[i] = a[i-1];
            x = a[a.length-1];
            
        }
        a[0] = x;
        }
        System.out.println("The elements of the result array are : ");
        for(int i : a)
        {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
