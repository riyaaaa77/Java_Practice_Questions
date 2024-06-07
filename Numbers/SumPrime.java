

public class SumPrime {
    public static void main(String [] args)
    {
        int n = 7896135;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            if(rem ==2 || rem == 3 || rem == 5 || rem == 7){
                sum+=rem;
            }
            n/=10;
        }
        System.out.println("Sum of prime digits : " + sum);
    }
}
