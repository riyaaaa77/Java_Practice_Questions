import java.util.Scanner;

public class KthFibbonacci {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k : "); 
        int k = sc.nextInt();
        sc.close();
        int x = 0;
        int n1 = 0;
        int n2 = 1;
        while(n1<k)
        {
            x = n1;
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(x );
    }
}
