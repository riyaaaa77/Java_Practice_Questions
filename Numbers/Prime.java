

public class Prime {
    public static void main(String [] args)
    {
        int n = 9, c = 0;
        for(int i =1; i<=n ; i++)
        {
            if(n%i == 0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Prime Num"); 
        }
        else
        {
            System.out.println("Not Prime Num");
        }
    }
}
