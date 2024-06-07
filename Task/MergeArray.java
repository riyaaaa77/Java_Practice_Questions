import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size :");
        byte size = s.nextByte();
        int [] arr1= new int[size];
        int [] arr2= new int[size];
        int [] arr3= new int[arr1.length+arr2.length];
        for(int i =0;i<arr1.length;i++){
            arr1[i]= s.nextInt();
            arr2[i]=s.nextInt();
        }
        int i =0;
        for( ;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int j =0;i<arr3.length;i++,j++){
            arr3[i]=arr2[j];
        }
        for(int j =0;j<arr3.length;j++){
            System.out.print(arr3[j] +"\t");
        }



        {System.out.println("========================");
            int arr4[] = new int[arr3.length];
            // reverse the given array
            int j =0;
            for( i =arr3.length-1;i>=0;i--,j++){
                arr4[j]=arr3[i];
                    System.out.print(arr4[j] + "\t");
            }
        }
    }
}
