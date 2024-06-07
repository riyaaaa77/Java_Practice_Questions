import java.util.Scanner;
public class DuplicateEle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        int [] a = new int[size];
        System.out.println("Enter the elements of the array ");
        for(int i = 0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The elements of the original array are : ");
        for(int i = 0; i<a.length ; i++)
        {
            System.out.print (a[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<a.length ; i++)
        {
            for(int j=i+1; j<a.length ; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println("Duplicate element is " + a[i] + " at index position " + i +" and "+ j );
                }
            }
        }
        sc.close();
    }
}
