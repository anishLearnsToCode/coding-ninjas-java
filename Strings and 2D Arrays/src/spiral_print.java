import java.util.Scanner;

public class spiral_print {

    public static int min(int a, int b){
        if(a<=b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int i, j, row, col, tail, head, p;
        Scanner s = new Scanner(System.in);

        row=s.nextInt();
        col=s.nextInt();

        int arr[][] = new int[row][col];

        for(i=0 ; i<row ; i++){
            for(j=0 ; j<col ; j++){
                arr[i][j]=s.nextInt();
            }
        }

        p=col+row-1;

        if(row==1)
            p=1;
        else if(col==1)
            p=2;
        else if(row==2)
            p=3;
        else if(col==2)
            p=4;
        else if(row!=col)
            p=2*min(row, col);

        for(i=0, tail=0, head=col ; i<p ; i++){
            if(i%2==0){

                //left to right
                if((i + 2)%4 != 0){
                    for(j=tail ; j<head ; System.out.print(arr[i/4][j]+" "), j++);
                    tail=1+(i/4);
                    head=row-i/4;
                }

                //right to left
                else{
                    for(j=tail ; j>=head ; System.out.print(arr[row-1-i/4][j]+" ") ,j--);
                    tail=row-1-i/4-1;
                    head=i/4+1;
                }
            }

            else{

                //down
                if((i+1)%4!=0){
                    for(j=tail ; j<head ; System.out.print(arr[j][col-i/4-1]+" "), j++);
                    tail=col-2-i/4;
                    head=i/4;
                }

                //up
                else{
                    for(j=tail ; j>=head ; System.out.print(arr[j][i/4]+" ") ,j--);
                    tail=i/4+1;
                    head = col-(i+1)/4;
                }
            }
        }


    }
}
