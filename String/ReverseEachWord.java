public class ReverseEachWord {
    public static void main(String[] args) {
        String str = " this is my pen keep it here ";

        String [] s = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = s.length-1; i>=0; i--)
        {
            sb.append(s[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
