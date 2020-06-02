import java.util.Scanner;

public class bsort {


    public static void sort(int arr[]) {
        int i, j, temp;

        for(i=0 ; i<arr.length ; i++) {
            for(j=i+1 ; j<arr.length ; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void arr_input(int arr[]) {
        int i;

        Scanner s = new Scanner(System.in);

        for(i=0 ; i<arr.length ; i++) {
            System.out.print("Value "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
    }

    public static void arr_display(int arr[]) {
        int i;
        for(i=0 ; i<arr.length ; System.out.print(arr[i]+"\t"), i++ );
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;

        System.out.print("\nEnter the size of the integer array that you wish to create : ");
          n = s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        sort(arr);

        arr_display(arr);
    }
}
