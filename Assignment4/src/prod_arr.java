import java.util.Scanner;

public class prod_arr {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner (System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n, p, i;

        System.out.print("Enter size of array : ");
        n = s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        for(i=0, p=1 ; i<arr.length ; p*=arr[i], i++);

        System.out.println(p);
    }
}
