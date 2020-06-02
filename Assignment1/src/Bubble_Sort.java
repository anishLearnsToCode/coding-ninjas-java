
import java.util.Scanner;

public class Bubble_Sort {

    public static void arr_input(int arr[]) {
        int i;

        Scanner s = new Scanner(System.in);

        for(i=0 ; i<arr.length ; i++) {
            System.out.print("\nValue "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
    }

    public static void arr_display(int arr[]) {
        int i;

        for(i=0 ; i<arr.length ; i++) {
            System.out.print("\nValue "+(i+1)+" : "+arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        int n;

        System.out.print("\nEnter the no. of elements in teh array : ");
        n = s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        Bubblesort(arr);

        arr_display(arr);
    }
}
