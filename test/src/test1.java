import java.util.Scanner;

public class test1 {

    public static int celcius(float f){
        return (int)((f-32)*(float) (5/9));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1, n2;
        float i;

        i=s.nextFloat();
        n1=s.nextInt();
        n2=s.nextInt();

        for( ; i<=n1 ; i=i+n2){
            System.out.println((int)i+" "+celcius(i));
        }
    }
}
