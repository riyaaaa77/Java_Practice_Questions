import java.util.Scanner;
public class ReverseWord {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of words : ");
        String s = sc.nextLine();

        String rev = "";
        String temp = "";
        for(int i = 0 ; i<s.length() ; i++ ) 
        {
            temp = temp + s.charAt(i);
            if(s.charAt(i) == ' ')
            {
                rev = temp+rev;
                temp = "";
            }
            if(i==s.length() - 1)
            {
                temp = temp + ' ';
                rev = temp+rev;
                temp = "";
            }
        }
        System.out.println(rev);
        sc.close();
    }
}
