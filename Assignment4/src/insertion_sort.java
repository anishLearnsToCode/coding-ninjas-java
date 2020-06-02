import java.util.Scanner;

public class insertion_sort {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]= s.nextInt();
        }
    }

    public static void sort(int arr[]){
        int i, j, k, temp;

        for(i=0 ; i<arr.length ; i++){
            for(j=0 ; j<i ; j++){
               if(arr[i]<arr[j]){
                   break;
               }
            }

            swap(i, j, arr);
        }
    }

    public static void swap(int i, int j, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void arr_display(int arr[]){
        int i;
        for(i=0 ; i<arr.length ; System.out.print("  "+arr[i]), i++);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("\nEnter the size of the array : ");
        n = s.nextInt();

        int arr[]=new int[n];

        arr_input(arr);

        sort(arr);

        arr_display(arr);

    }
}
