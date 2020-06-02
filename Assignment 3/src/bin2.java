import java.util.Scanner;
import java.lang.Math.*;

public class bin2 {

    public static void dec_bin(int n) {
        int i, arr[] = new int[20], p;

        for(i=0, p=0 ; n!=0 ; i++, p++) {
            arr[i]=n%2;
            n/=2;
        }

        for(i=0 ; i<p ; i++){
            System.out.print(arr[p-i-1]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n;

        System.out.print("\nEnter your decimal no. : ");
        n = s.nextInt();

        dec_bin(n);
    }
}
