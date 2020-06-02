import java.util.Scanner;

public class ques1 {

    static float min(float a, float b)
    {
        if(a<b)
            return a;
        else if(b<a)
            return b;
        else if(a==b)
            return a;

        return a;
    }

    public static void main(String[] args) {
        String name;
        float marks[] = new float [3];
        float sum;
        int i, j;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name of the Student");
        name = s.nextLine();

        for(i=0 ; i<3 ; i++)
        {
            System.out.println("Enter the marks of Subject"+(i+1));
            marks[i] = s.nextFloat();
        }

        for(i=0 ; i<3 ; i++)
        {
            if(min(marks[0], min(marks[1], marks[2])) == marks[i])
                break;
        }

        for(j=0 , sum =0; j<3 ; j++)
        {
            if(j==i)
                continue;

            sum+=marks[j];
        }

        System.out.println("name : "+name);
        System.out.println("Average Marks : "+sum/2);
    }
}
