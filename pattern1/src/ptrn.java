import java.util.Scanner;

public class ptrn {
    public static void main(String[] args) {

        int n, i, j, p;

        Scanner s = new Scanner(System.in);

        System.out.println("\t\t\tPattern Printer");
        System.out.println("Enter the no. of lines in Pattern\t");
          n = s.nextInt();

        for(i=0, p=1 ; i<n ; System.out.println(""), i++) {
            for(j=0 ; j<=i ; System.out.print(p) ,j++, p++);
        }
    }
}
