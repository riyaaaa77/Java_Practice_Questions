
public class SumEven {
    public static void main(String [] args)
    {
        int rem, sum =0;
        int n = 121212;
        while(n>0)
        {
            rem = n%10;
            if(rem%2==0)
            {
                sum += rem;
            }
            n/=10;
        }
        System.out.println("The sum of even digits is : " + sum);
    }
}
