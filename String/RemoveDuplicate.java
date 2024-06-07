public class RemoveDuplicate {
    public static void main(String[] args) {
        String s1 = "rriyaa";
        String s2 = "";
        // char [] ch = s.toCharArray();
        // boolean res = false;
        for(int i=0;i<=s1.length()-1 ; i++)
        {
            for(int j = i+1; j<=s1.length()-1;j++)
            {
                if(s1.charAt(i) == s1.charAt(j))
                {
                   s2 +=s1.charAt(i); 
                }
            }
        }
        System.out.println(s2);

    }
}
