package Pattern;
public class Pattern10 {
    public static void main(String [] args)
    {
        int n = 5;
        int num = 1;
        for(int i = 0; i<n; i++)
        {
            int x = num;
            for(int j = 0; j<=i; j++)
            {
                System.out.print(x + " ");
                x += n-j-1;
            }
                num++;
                System.out.println();  
        }
    }
}
