package Pattern;

public class Pattern12 {
    public static void main(String [] args)
    {
        int n =5 ;
        char c = 'A';
        for (int i = 1; i<=n; i++)
        {
            for(int j =1; j<=n; j++)
            {
                if(i==1 || i == 5 || j == 1 || j == 5)
                {
                    System.out.print(c + " ");
                    c++;
                }
            }
            System.out.println();
        }
    }
}
