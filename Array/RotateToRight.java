
import java.util.Scanner;

public class RotateToRight {
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
        // int x = a[0];
        // System.out.println("Enter the value of rotation (n) : ");
        // int n = sc.nextInt();
        // n=n%a.length;
        // for(int j = 1; j<=n ; j++){
        // for(int i = 0; i<a.length-1; i++)
        // {
        //     a[i] = a[i+1];
        // }
        // a[a.length-1] = x;
        System.out.println("Enter the value of rotation (n) : ");
        int n = sc.nextInt();
        int x= a[a.length-1];
        for(int i =1;i<=n;i++){
            for(int j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=x;
             x=a[a.length-1];
        }
        System.out.println("The elements of the result array are : ");
        for(int i : a)
        {
            System.out.print(i + " ");
        }
        sc.close();
    }
    }
        

