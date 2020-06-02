import java.util.Scanner;

public class ptrn {
    public static void main(String[] args) {
        int n , i, j;
        char ch = '*';

        Scanner s = new Scanner(System.in);

        System.out.println("\t\t\tPattern Generator");
        System.out.println("Enter the no. of lines");
          n = s.nextInt();
      /*  System.out.println("Enter the chracter");
          ch = s.nextLine().charAt(0); */

        for(i=0 ; i<n ; System.out.println("") ,i++) {
            for(j=0 ; j<n-i ; System.out.print(" ") ,j++);
            for(j=0 ; j<2*i+1 ; System.out.print(ch) ,j++);
        }

        for(i=n ; i>=0 ; System.out.println("") ,i--) {
            for(j=0 ; j<n-i ; System.out.print(" ") ,j++);
            for(j=0 ; j<2*i+1 ; System.out.print(ch) ,j++);
        }
    }
}
