import java.util.Scanner;

public class BuzzNum {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : "); 

        int n = sc.nextInt();
        if(n%7==0 || n%10 == 7)
        {
            System.out.println("The num is Buzz");
        }
        else{
            System.out.println("The num is not Buzz");
        }
        sc.close();
    }
}
