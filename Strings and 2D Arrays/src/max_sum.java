import java.util.Scanner;

public class max_sum {

    public static void findmax(int arr[][]){
        int i, j, k1=0, k2=0, row=arr.length, col=arr[0].length, sum, index_row=0, index_col=0, sum2;

        for(i=0, sum=0 ; i<row ; sum=0, i++){
            for(j=0 ; j<col ; sum+=arr[i][j], j++);

            if(i==0)
                k1=sum;

            else if(sum>k1){
                k1=sum;
                index_row = i;
            }

        }

        for(i=0, sum2=0 ; i<col ; sum2=0, i++){
            for(j=0 ; j<row ; sum2+=arr[j][i], j++);

            if(i==0)
                k2=sum2;

            else if(sum2>k2){
                k2=sum2;
                index_col=i;
            }
        }

        if(k1>=k2){
            System.out.println("row"+" "+index_row+" "+k1);
        }

        else{
            System.out.println("col "+index_col+" "+k2);
        }
    }

    public static void main(String[] args) {
        int i, j, rows, cols;
        Scanner s = new Scanner(System.in);

        rows=s.nextInt();
        cols=s.nextInt();

        int arr[][] = new int[rows][cols];

        for(i=0 ; i<arr.length ; i++){
            for(j=0 ; j<arr[0].length ; j++){
                arr[i][j]=s.nextInt();
            }
        }

        findmax(arr);
    }
}
