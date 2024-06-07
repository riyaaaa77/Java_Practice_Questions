public class StringtoArray {
    static String s = "Hello World!";
    public static char [] StringToArray(String s)
    {
        char [] c = new char[s.length()];
        for(int i = 0; i<c.length; i++)
        {
            c[i] = s.charAt(i);
        }
        return c;
    }
    public static void main(String[] args) {
        char [] ch = StringToArray(s);
        for(char i : ch)
        {
            System.out.println(i);
        }
    }
}
