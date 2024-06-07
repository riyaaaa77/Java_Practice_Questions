import java.util.Scanner;
public class BinarySearch {
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
        System.out.println("Enter the number to search : ");
        int start = 0;
        int end = a.length-1;
        int n = sc.nextInt();

        while(a[start]<=a[end])
        {
            int mid = (start+end)/2;
            if(a[mid] == n)
            {
                System.out.println("N is present is the array " );
                break;
            }
            else if(a[mid]<n)
            {
               start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        sc.close();
        
    }
}
