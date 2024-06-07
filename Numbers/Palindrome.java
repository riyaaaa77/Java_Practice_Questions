import java.util.Scanner;

public class Palindrome {
     public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : "); 
        int n = sc.nextInt();
        int on = n;
        int rn = 0;
        while(n!=0)
        {
           int rem = n%10; 
            System.out.print(rem );
            rn = rn*10+rem;
            n/=10;
        }
        System.out.println();

        sc.close();
        if(on == rn)
        {
            System.out.println("Palindrom num");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
