import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        char a;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the character");
        a = s.nextLine().charAt(0);

        if((a>=97) && (a<=122))
            System.out.println("The character is a small letter character");
        else if((a>=65) && (a<=90))
            System.out.println("The character is Capital");
        else
            System.out.println("Invalid entry");
    }
}
