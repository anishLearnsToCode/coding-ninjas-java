import java.util.Scanner;

public class Linear_Search {

    public static void arr_input(int arr[]) {
        int i;

        Scanner s = new Scanner(System.in);
        System.out.println("");

        for(i=0 ; i<arr.length ; i++) {
            System.out.print("Value "+(i+1)+" : ");
              arr[i] = s.nextInt();
        }
    }

    public static void arr_search(int arr[], int n) {
        int i, x=0;

        for(i=0 ; i<arr.length ; i++) {
            if(arr[i]==n) {
                x=1;
                System.out.println("The element exits at "+i+"th index");
            }
        }

        if(x==0)
            System.out.println("Element not found");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;

        System.out.print("Enter the length of the integer array : ");
          n = s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        System.out.print("\nEnter element you wish to search for : ");
          n = s.nextInt();

        arr_search(arr, n);
    }
}
