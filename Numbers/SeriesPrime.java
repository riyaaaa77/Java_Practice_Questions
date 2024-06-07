public class SeriesPrime {
    public static void main(String[] args) {
       int start = 10;
       int end = 50;
       
       for(int i= start; i<= end; i++)
       {
            if(prime(i) == true)
            {
                System.out.print(i + " ");
            }
       }
       System.out.println();
    }
    public static boolean prime(int num)
    {
        int c = 0;
        for(int i = 1; i<=num; i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
