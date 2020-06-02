import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        float b, x, n;
        int i;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the base value : \t");
          b = s.nextFloat();
        System.out.print("\nEnter the exponent value : \t");
          x = s.nextFloat();

        for(i=0, n=1 ; i<x ; n*=b, i++);

        System.out.println(b+"^"+x+"= "+n);
    }
}
