public class VowelInString {
    public static void main(String[] args) {
        String str = "Hello riya";
        char [] ch = str.toCharArray();

        for(int i = 0; i<=ch.length-1 ; i++)
        {
            if(ch[i] == 'a' || ch[i]=='i' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u')
            {
                System.out.println(ch[i]);
            }
        }
    }
}
