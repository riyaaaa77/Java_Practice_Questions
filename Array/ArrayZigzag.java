
import java.util.Scanner;

public class ArrayZigzag {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size off 1st array : ");
        int size = sc.nextInt();

        int a[]  = new int[size]; 
        System.out.println("Enter the elemnts off 1st array :");
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the size of 2nd array : ");
        int size2 = sc.nextInt();
        int b [] = new int[size2];
        System.out.println("Enter the elemnts of 2nd array :");
        for(int i=0;i<b.length;i++)
        {
            b[i] = sc.nextInt();
        }
        int k = 0;
        int [] c = new int[a.length + b.length];
        //int [] c = new int[size + size2];
        for(int i =0; i<(c.length); i++)
        {
            if(i<a.length){
                c[k++] = a[i];
            }
            if(i<b.length){
                c[k++] = b[i];  
            }
        }
        /*for(int i = 0; i<(a.length + b.length); i++)
        {
            System.out.println(c[i]);
        }*/
        System.out.println("The result array is : ");
        for(int i : c)
        {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
