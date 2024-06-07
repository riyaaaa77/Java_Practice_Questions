public class ArmstrongNum{
    public static void main(String[] args) {
        int n = 407;
        if(isArms(n)==true)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
    public static boolean isArms(int num)
    {
        int onum = num, sum =0;
        int rem, digs = digCount(onum);
        while(num!=0)
        {
            rem = num%10;
            sum += power(rem,digs);
            num /= 10;
        }
        return onum == sum;

    }
    public static int digCount(int num)
    {
        int count =0;
        while(num!=0)
        {
            num /= 10;
            count++;
        }
        return count;
    }
    public static int power(int base, int power)
    {
        int p = 1;
        for(int i = 0; i<power ; i++)
        {
            p *= base;
        }
        return p;
    }
}