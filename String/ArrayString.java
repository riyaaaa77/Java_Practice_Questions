public class ArrayString {
    public static void main(String[] args) {
        char [] ch = { 'r' , 'i', 'y' , 'a'};
        StringBuffer res = new StringBuffer();
        for(int i =0; i<=ch.length-1 ; i++)
        {
            res = res.append(ch[i]);
        }
        System.out.println(res);
    }
}
