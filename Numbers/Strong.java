public class Qus4 {
    public static void main(String[] args) {
        int n = 145;
        int n1 = n;
        int sum = 0;
        while(n!=0)
        {
            int rem = n%10;
            sum += fact(rem);
            n/=10;
        }
        if(n1==sum)
        {
            System.out.println("Strong Num");
        }
        else{
            System.out.println("Not Strong num");
        }
    }
    public static int fact(int num)
    {
        int f =1;
        for(int i=1; i<=num ; i++)
        {
            f*=i;
        }
        return f;
    }
}
