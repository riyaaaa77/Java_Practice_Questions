

public class Pattern9 {
    public static void main(String [] args)
    {
        int x = 1;
        for(int i = 1; i<=2; i++)
        {
            for(int j = 1; j<=5; j++)
            {
                System.out.print(x++ + " ");
            }
            for(int k =1; k<=4; k++)
            {
                System.out.println();
            }
        }
    }
}
