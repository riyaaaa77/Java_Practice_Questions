import java.util.Scanner;

public class PowerOdd {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : "); 

        int n = sc.nextInt();
        int rem;
        while(n!=0)
        {
            rem = n%10;  
            if(rem%2!=0)
            {
               int res = power(rem,4);
               System.out.println("The power of " + rem + " is " + res);
            }
            n/=10;
        }
        sc.close();
    }
    public static int power(int base, int power)
    {
        int p =1;
        for(int i =1; i<power;i++)
        {
            p *= base;
        }
        return p;
    }
}
