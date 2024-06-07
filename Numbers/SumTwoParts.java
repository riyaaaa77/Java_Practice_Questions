import java.util.Scanner;
public class SumTwoParts {
    public static void (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Enter the position to spilit the number in two parts");
        int position = sc.nextInt();

        int div = 1;
        for(int i = 1; i<position; i++)
        {
            div *= 10;
        }
        int fp = n%div;
        int sp = n/div;

        int sum = fp+sp;
        System.out.println("The sum of two parts of given num is : " + sum);

    }
}
