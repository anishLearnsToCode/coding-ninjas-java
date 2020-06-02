import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        float t_sal, basic, hra, da, allow, pf;
        char grade;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the basic salary of the person");
        basic = s.nextFloat();

        System.out.println("Enter the grade of the person");
        grade = s.next().charAt(0);

        hra = 0.2f*basic;
        da = 0.5f*basic;
        if(grade=='A')
            allow = 1700;
        else if(grade=='B')
            allow = 1500;
        else
            allow = 1300;

        pf=0.11f*basic;

        System.out.println("The total salary is "+(basic+hra+da+allow-pf));
    }
}
