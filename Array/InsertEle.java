import java.util.Scanner;
public class InsertEle {
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
        System.out.println("Enter the index position to insert the element : ");
        int index = sc.nextInt();
    
        System.out.println("Enter the element : ");
        int ele = sc.nextInt();

        if(index < 0 || index >= a.length)
        {
            System.out.println("Invalid index.");
        }
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = ele;
        for (int num : a) {
            System.out.print(num + " ");
        }
        sc.close();

    }
}
