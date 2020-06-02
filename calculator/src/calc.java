import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        float a, b;
        int n;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first no. \t");
          a = s.nextFloat();
        System.out.println("Enter the second no.\t");
          b = s.nextFloat();

        System.out.println("Select any mathematical function");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
          n = s.nextInt();

        if(n==1)
            System.out.println(a+"+"+b+"="+(a+b));
        else if(n==2)
            System.out.println(a+"-"+b+"="+(a-b));
        else if(n==3)
            System.out.println(a+"x"+b+"="+(a*b));
        else if(n==4)
            System.out.println(a+"/"+b+"="+(a/b));
    }
}
