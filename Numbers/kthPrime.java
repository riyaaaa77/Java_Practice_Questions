public class kthPrime {
    public static void main(String[] args) {
    int k = 5;
    System.out.println(k+"th prime num is:" + findkth(k));
    }
    public static int findkth(int k)
    {
        int c =0;
        int num = 2;
        
        while(true)
        {
           if(prime(num))
           {
               c++;
               if(c==k)
               {
                  return num; 
               }
           }
           num++;
        }
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
