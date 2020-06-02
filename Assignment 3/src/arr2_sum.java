import java.util.Scanner;

public class arr2_sum {


    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]= s.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n, i, j;

        System.out.print("\nEnter the no. of elements in arr : ");
        n = s.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        System.out.println("Enter the values of first array");
        arr_input(arr1);
        System.out.println("Enter the values of second array");
        arr_input(arr2);

        for(i=0 ; i< arr1.length ;i++ ){
            System.out.print(arr1[i]+arr2[i]+"  ");
        }
    }
}
