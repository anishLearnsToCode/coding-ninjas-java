import java.util.Scanner;

public class arr_wave {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
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

            temp = arr[i];
            for(k=i-1 ; k>=j ; arr[k+1]=arr[k], k--);
            arr[j]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, j, temp;

        System.out.print("Enter size");
        n=s.nextInt();

        int arr2[] = new int[2*n];
        int arr[] = new int[n];

        arr_input(arr);

        sort(arr);

        for(i=0 ; i<arr.length ; i++){
            arr2[2*i+1]=arr[i];
        }

        for(i=0 ; i<arr.length/2 ; i++){
            arr2[2*i]=arr[arr.length-i-1];
        }

        for(i=0 ; i<arr.length ; System.out.print(arr2[i]+"  "), i++);
    }
}
