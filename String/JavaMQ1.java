import java.util.Scanner;

public class JavaMQ1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        String [] words = s.split(" ");

        String revstr = "";
        String revword ="";
        for(int i = 0; i<words.length; i++)
        {
            String word = words[i];
            for(int j = word.length()-1; j>=0; j--)
            {
                revword = revword + word.charAt(j);
            }
            revword += " ";
        }
        revstr = revstr + revword ;
        System.out.println(revstr);
        sc.close();
    }
}