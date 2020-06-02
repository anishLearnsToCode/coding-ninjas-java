import java.util.Scanner;

public class wave_print {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j, row, col;

        row=s.nextInt();
        col=s.nextInt();

        int arr[][] = new int[row][col];

        for(i=0 ; i<row ; i++){
            for(j=0 ; j<col ; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for(i=0 ; i<col ; i++){
            for(j=0 ; j<row ; j++){

                if(i%2==0){
                    System.out.print(arr[j][i]+" ");
                }

                else{
                    System.out.print(arr[row-j-1][i]+" ");
                }

            }
        }
    }
}
