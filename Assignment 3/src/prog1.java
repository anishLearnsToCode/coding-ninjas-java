import java.util.Scanner;

import static java.lang.Math.pow;

public class prog1 {

    public static int intlen(int n) {
        int i;

        for(i=0 ; n!=0 ; n/=10, i++);

        return i;
    }

    public static int digit(int i, int n) {
        return (int)(n/pow(10, intlen(n)-i-1))%10;
    }

    public static int bin_dec(int n) {
        int i, sum;

        for(i=0, sum=0 ; i<intlen(n) ; i++) {
            sum+=pow(2,intlen(n)-i-1)*digit(i, n);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, bin;

        System.out.print("\nEnter the binary no. : ");
        n = s.nextInt();

        bin = bin_dec(n);

        System.out.println(bin);
    }
}
