import java.util.Scanner;

public class maxvalue {

    public static int max_value(int arr[])
    {
        int k, i;

        for(i=0, k=arr[0] ; i<arr.length ; i++)
        {
            if(arr[i]>k)
              k=arr[i];
        }

        return k;
    }


    public static void main(String[] args) {
        int i, k, n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no. of entries : ");
        n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the valus of the array");

        for(i=0 ; i<arr.length ; i++)
        {
            System.out.print("Value "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }

        k = max_value(arr);
        System.out.println("Maximum Value : "+k);
    }
}
