import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        String num;
        int i, sum1, sum2, n, a;

        Scanner s = new Scanner (System.in);

        System.out.println("Enter your no.");
        n = s.nextInt();
        System.out.println(len(n));
        for(i=0, sum1=0, sum2=0 ; i<len(n); i++)
        {
            a=(n - n%(int)Math.pow(10.0, len(n)-1-i))/(int)Math.pow(10.0, len(n)-1-i);
            System.out.println(a);

            if((i+1)%2==0)
                sum2+=a;

            else
                sum1+=a;

            n = n - (n%(int)(Math.pow(10.0, len(n)-1-i)))*(int)(Math.pow(10.0, len(n)-1-i));
            System.out.println(n);
        }

        System.out.println("Even Sum = "+sum2);
        System.out.println("Odd Sum = "+sum1);
    }

    private static double len(int n) {
        double i;

        for(i=0 ; n!=0 ; i++)
        {
            n=n/10;
        }

        return i;
    }
}
