import java.util.Scanner;

public class sum_rows {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int rows, cols, i ,j, sum;

        rows=s.nextInt();
        cols=s.nextInt();

        int arr[][] = new int[rows][cols];

        for(i=0 ; i<arr.length ; i++){
            for(j=0 ; j<arr[i].length ; j++){
                arr[i][j]=s.nextInt();
            }
        }

        for(i=0, sum=0 ; i<arr.length ; sum=0, i++){
            for(j=0 ; j<arr[i].length ; sum+=arr[i][j], j++);
            System.out.print(sum+" ");
        }
    }
}
