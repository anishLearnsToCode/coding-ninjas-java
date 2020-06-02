import java.util.Scanner;

public class arr_rotate {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static int min(int arr[]){
        int i, k;
        for(i=0, k=arr[0] ; i<arr.length ; i++){
            if(arr[i]<k){
                k=arr[i];
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;

        System.out.print("Enter size : ");
        n=s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        for(i=0 ; i<arr.length ; i++){
            if(arr[i]==min(arr)){
                break;
            }
        }

        System.out.println(i);
    }
}
