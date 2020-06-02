import java.util.Scanner;

public class duplicate {

    public static void arr_input(int arr[]){
        int i;
        Scanner s = new Scanner(System.in);

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, i, j;

        System.out.print("\nEnter the no. of elements in the arr : ");
        n=s.nextInt();

        int arr[]=new int[n];

        arr_input(arr);

        for(i=0 ; i<arr.length ; i++){
            for(j=i+1 ; j<arr.length ; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
