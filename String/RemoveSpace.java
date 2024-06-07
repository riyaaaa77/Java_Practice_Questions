public class RemoveSpace {
    public static void main(String[] args) {
        String s = "Riya a a";
        char ch [] = s.toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<ch.length ; i++)
        {
            if(ch[i] != ' ')
            {
                res = res.append(ch[i]);
            }
        }
        System.out.println(res);
    }
}
