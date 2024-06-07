import java.util.Scanner;
public class CountChars {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        char [] c1 = s.toCharArray();
        char [] c2 = s.toCharArray();

        int count = 0;

        for(int i = 0; i<s.length(); i++)
        {
           char x = c1[i];
           for(int j = 0; j<c1.length; j++)
           {
                if(x==c2[j])
                {
                    count++;
                    c2[j] = '/';
                }
           }
           if(count>0)
           {
                System.out.println(x + "--->" + count);
                count = 0;
           }
        }

        sc.close();
    }
}
