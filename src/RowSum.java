import java.util.Scanner;

public class RowSum {
    public static int[] rowSum(int arr[][],int r,int c){
        int ans[]=new int[r];
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
              sum=sum+arr[i][j];
            }
            ans[i]=sum;
            sum=0;

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans[]=rowSum(arr,r,c);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}