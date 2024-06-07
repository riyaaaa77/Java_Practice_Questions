import java.util.Scanner;
public class CountSpecialChar {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
         
        int a=0, num =0, c1=0 ;
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c>='A' && c<='Z' || c>='a' && c<='z' )
            {
                a++;
            }
            else if(c>='0' && c<='9')
            {
                num++;
            }
            else{
                c1++;
            }
        }
        System.out.println("Number of character : " + a);
        System.out.println("Number of numbers : " + num);
        System.out.println("Number of special charactrers : " + c1);
        sc.close();
    }
}
