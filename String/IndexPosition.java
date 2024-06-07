public class IndexPosition {
        public static void main(String[] args) {
        String s = "shuvani";
        char c = 'u';
        char c1[] = s.toCharArray();
        for(int i=0;i<c1.length;i++){
          if(c1[i]==c){
            System.out.println(i);
          }
        }
        }
    }
