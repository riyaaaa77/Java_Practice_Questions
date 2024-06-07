public class LastFour {
    public static void main(String[] args) {
        String s = "Riyahiih";
        String res = "";

        for(int i =s.length()-1; i>=0; i--)
        {
            res =res +s.charAt(i);
        }
        char [] c = res.toCharArray();
        for(int i = 0 ; i<4; i++)
        {
            System.out.println(c[i]);
        }
    }
}
