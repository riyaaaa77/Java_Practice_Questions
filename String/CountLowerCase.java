public class CountLowerCase {
    public static void main(String[] args) 
    {
      String s = "riya@Riy%%";
      char [] c = s.toCharArray();
      int count = 0;
      for(int i = 0; i<c.length; i++)
      {
        if(!(c[i]>='A' && c[i] <='Z') || (c[i] >='0' && c[i]<='9'))
        {
            count++; 
        }     
    }
    System.out.println(count);
    }
}
