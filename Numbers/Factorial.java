import java.util.Scanner;

public class Factorial {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : "); 
        int n = sc.nextInt();

        while(n!=0)
        {
            int rem = n%10;
            int fact = 1;
            for(int i = 1; i<=rem ; i++)
            {
                fact*=i;
            }
            System.out.println("The factorial of " + rem + " is " + fact);
            n/=10;
        }
        sc.close();
    }
}
