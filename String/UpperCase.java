import java.util.Scanner;
public class UpperCase {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Original String is :");
        char [] c = s.toCharArray();
        for(int i = 0; i<=c.length-1 ; i++)
        {
            if(c[i]>='a' && c[i] <='z')
            {
                c[i] = (char)(c[i] - 32);
            }
        }
        System.out.println(c);
        sc.close();

    }
}
