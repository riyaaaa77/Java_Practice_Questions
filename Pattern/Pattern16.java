package Pattern;

public class Pattern16 {
    public static void main(String [] args)
    {
        for(int i =1; i<=5; i++)
        {
            for(int k = 1 ; k>=(5-i) ;k++)
            {
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int p =1; p<= 5-i; p++)
        {
            for(int z = 4-p ; z>0 ;z--)
            {
                System.out.print(" ");
            }
            for(int j= 1; j<=p; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
