
import java.util.Scanner;

public class MoveZero {
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
        System.out.println("The elements of the original array are ");
        for(int i = 0; i<a.length; i++)
        {
            System.out.print( a[i] + " "); 
        }
        System.out.println();

        int [] b = new int[size];
        int k =0;
        for(int i = 0; i<a.length; i++)
        {
            if(a[i] != 0){
                b[k++] = a[i];   
            }
        }
        System.out.println("The elements of the result array are ");
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(b[i]+" "); 
        }
        sc.close();
    }
}
