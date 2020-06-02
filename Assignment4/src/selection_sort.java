import java.util.Scanner;

public class selection_sort {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }


    public static void arr_display(int arr[]){
        int i;

        for(i=0 ; i<arr.length ; System.out.print(arr[i]+"  "), i++ );
    }

    public static void sort(int arr[]){
        int i, k, j;
        for(i=0 ; i<arr.length ; i++) {

            for (j = i, k = arr[i]; j < arr.length; j++) {
                if (arr[j] < k)
                    k = arr[j];
            }

            for (j=index(k, arr) ; j>i ; j--){
                arr[j]=arr[j-1];
            }

            arr[i]=k;
        }
    }

    public static int index(int i, int arr[]){
        int j;

        for (j=0 ; j<arr.length ; j++){
            if(i==arr[j])
                break;
        }

        return j;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;

        System.out.print("Enter the size of the array : ");
        n=s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        sort(arr);

        arr_display(arr);
    }
}
