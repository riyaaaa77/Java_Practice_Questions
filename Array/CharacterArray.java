
import java.util.Scanner;

public class CharacterArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        char a [] = new char[size];
        for(int i = 0; i<a.length ; i++)
        {
            a[i] = sc.next().charAt(0);
        }
        for(int i = 0; i<a.length ; i++)
        {
            System.out.println ( "The array elemnt "+ i+  " is " + a[i]);
        }
        int s = 0, e = a.length-1;
        boolean flag = false;
        while(s<e)
        {
            if(a[s] == a[e]){
                flag = true;
                break;
            }
            s++;
            e--;
        }
        if(flag == true)
        {
                System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
