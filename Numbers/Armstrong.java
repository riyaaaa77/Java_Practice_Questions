import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();

        if(isArms(num) == true)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
    public static int power(int base, int power)
    {
        int p = 1;
        for(int i =0; i<power ; i++)
        {
            p*=base;
        }
        return p;
    }
    public static int digitCount(int n){
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        return count;
    }
    public static boolean isArms(int num)
    {
        int originalnum = num;
        int digcount = digitCount(num);
        int sum = 0;

        while(num!=0)
        {
            int rem = num%10;
            sum += power(rem,digcount);
            num/=10;
        }
        return sum==originalnum;
    }
}
