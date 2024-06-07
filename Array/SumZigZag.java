import java.util.Scanner;
public class SumZigZag {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first array : ");
        int size = sc.nextInt();

        int a [] = new int[size];
        System.out.println("Enter the elements of first array : ");
        for(int i = 0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The elemenets of the first array is : ");
        for(int i = 0; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        
        System.out.println("Enter the size of second array : ");
        int size1 = sc.nextInt();

        int b [] = new int[size1];
        System.out.println("Enter the elements of second array : ");
        for(int i = 0; i<b.length; i++)
        {
            b[i] = sc.nextInt();
        }
        System.out.println("The elemenets of the second array is : ");
        for(int i = 0; i<b.length ; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        int [] c = new int[size+size1];
        int k = 0;
        for(int  i =0; i<b.length ; i++)
        {
           if(i<a.length)
           {
                c[k++] = a[i];
           }
           if(i<b.length)
           {
                c[k++] = b[i];
           } 
        }
        System.out.println("The zigzag array is : ");
        for(int i : c)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i <c.length; i++)
        {
            sum+=c[i];
        }
        System.out.println("The sum of zigzag array is : " + sum);
        sc.close();
    }
}
