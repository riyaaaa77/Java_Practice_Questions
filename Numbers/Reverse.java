import java.util.Scanner;

public class Reverse {
     public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : "); 
        int n = sc.nextInt();

        while(n!=0)
        {
            int rem = n%10; 
            System.out.print(rem );
            n/=10;
        }
        sc.close();
    }
}
