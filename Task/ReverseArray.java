public class ReverseArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int start = 0,end = a.length-1,temp=0;
        for( ;start<=end; start++,end--){
            temp= a[start];
            a[start]=a[end];
            a[end]=temp;
           
        }
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
