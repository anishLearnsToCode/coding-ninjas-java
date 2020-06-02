import java.util.Scanner;

public class sort_bin {

    public static void sort(int arr[]){
        int i, j;

        for(i=0, j=0 ; i<arr.length ; i++){
            if(arr[i]==0){
                j++;
            }
        }

        for(i=0 ; i<j ; i++){
            arr[i]=0;
        }
        for(i=j ; i<arr.length ; i++){
            arr[i]=1;
        }
    }

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static void arr_display(int arr[]){
        for(int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, n, j;

        System.out.print("\nenter the size of array : ");
        n=s.nextInt();

        int arr[]= new int[n];

        arr_input(arr);

        sort(arr);

        arr_display(arr);
    }
}
