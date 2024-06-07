
import java.util.Scanner;
public class MergeArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of 1st array : ");
        int size = sc.nextInt();

        int a[]  = new int[size]; 
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the size of 2nd array : ");
        int size2 = sc.nextInt();
        int b [] = new int[size2];
        for(int i=0;i<b.length;i++)
        {
            b[i] = sc.nextInt();
        }
        int k = 0;
        //int [] c = new int[a.length + b.length];
        int [] c = new int[size + size2];
        for(int i =0; i<a.length ; i++)
        {
            c[k++] = a[i];
        }
        for(int i = 0; i<b.length; i++)
        {
            c[k++] = b[i];
        }
        for(int i = 0; i<(a.length + b.length); i++)
        {
            System.out.println(c[i]);
        }
        sc.close();
    }
}
