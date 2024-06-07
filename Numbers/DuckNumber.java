
public class DuckNumber {
    public static void main(String [] args)
    {
        int n = 56356, rem;
        boolean b = false;
        while(n!=0)
        {
            rem = n%10;
            if(rem == 0)
            {
                 b = true;
                 break;
            }
           
            n/=10;
        }
        if(b)
        {
            System.out.println("Duck num");
        }
        else{
            System.out.println("Not Duck num");
        }
    }
}
