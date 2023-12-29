import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("The Entered matrix:");
        String arr1=Arrays.deepToString(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=arr.length;j>=0;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        s.close();
        System.out.println(arr1);
    }
}
