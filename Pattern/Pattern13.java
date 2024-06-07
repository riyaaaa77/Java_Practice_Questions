package Pattern;

public class Pattern13 {
    public static void main(String [] args){

    int x = 0;
    for(int i = 1; i<= 5; i++)
    {
        for(int j =1; j<=i; j++)
        {
            System.out.print(x + " ");
            x = 1-x;
        }
        System.out.println();
    }
}
}