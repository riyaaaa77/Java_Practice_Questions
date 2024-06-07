import java.util.Scanner;

public class OddFibbonacci {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : "); 

        int r = sc.nextInt();
        sc.close();
        int n1 = 0;
        int n2 = 1;
        while(n1<r)
        {
            if(n1%2!=0){
                System.out.println(n1 + " ");
            }
            int next = n1+n2;
            n1=n2;
            n2=next;
        }
    }
}
