import java.util.Scanner;
public class Example2 {
    public static void main(String [ ]args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr []  = new int[n];
        
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print("Enter the array " + i +  " element ") ;
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);   
        }
        for(int i =0; i<arr.length ; i++)
        {
            sum += arr[i];  
        }
        System.out.println("sum of array is " + sum);
        sc.close();
    }
}
