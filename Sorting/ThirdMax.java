import java.util.Scanner;
public class ThirdMax {
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
         //Bubble sort to find the 3rd max
         for(int i = 0; i<a.length-1;i++)
         {
             for(int j= i+1; j<a.length ; j++)
             {
                 if(a[i]<a[j])
                 {
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
         }
         for(int i = 0; i<a.length;i++)
         {
            if(i==2)
            {
                System.out.println("The 3rd max element is array is : " + a[i]);
            }
         }
         sc.close();
        }

}
