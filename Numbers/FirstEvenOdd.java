import java.util.Scanner;

public class FirstEvenOdd {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : "); 
        int n = sc.nextInt();
        int fd = 0;
        while(n!=0)
        {
            fd = n;
            n/=10;
        }
        if(fd%2==0)
        {
            System.out.println("Fisrt digit is even");
        }
        else{
            System.out.println("First digit is odd"); 
        }
        sc.close();
    }
}
