import java.util.Scanner;
import java.lang.Math.*;

public class sum_arr {

    public static void arr_input(int arr[]) {
        int i;

        Scanner s = new Scanner(System.in);

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, i, sum1, sum2;

        System.out.print("\nEnter the no. of elements you want in the array : ");
        n= s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        for(i=0, sum1=0, sum2=0 ; i<arr.length ; i++) {
            if(arr[i]>=0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }

        System.out.println("Sum of positive : "+sum1);
        System.out.println("Sum of negative : "+sum2);
    }
}
