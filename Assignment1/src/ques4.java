import java.util.Scanner;
import java.math.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ques4 {
    public static void main(String[] args) {
        double a, b, c, D;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the coefficient of x^2");
          a = s.nextFloat();
        System.out.println("Enter the coefficient of x");
          b = s.nextFloat();
        System.out.println("Enter the coeficcent of x^0");
          c = s.nextFloat();

        D = sqrt(pow(b, 2) - 4*a*c);

        System.out.println("The roots of "+a+"x^2"+b+"x"+c+"=0 are");
        System.out.println("x1 = "+(-b+D)/(2*a));
        System.out.println("x2 = "+(-b-D)/(2*a));
    }
}
