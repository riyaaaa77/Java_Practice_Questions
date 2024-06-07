import java.util.Scanner;
public class BubbleSort {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int [] a =  new int[size];
        for(int i = 0; i<a.length;i++)
        {
            a[i] = sc.nextInt();        
        }
        System.out.println("The original array : ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //Bubble sort
        for(int i = 0; i<a.length-1;i++)
        {
            for(int j= i+1; j<a.length ; j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted array ");
        for(int i : a)
        {
            System.out.print(i + " ");
        }
        sc.close();
    }
}

