import java.util.Scanner;

public class equilibrium {

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
        int i, n, k, sum1, sum2;

        System.out.print("Enter size : ");
        n=s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        for(i=0 ; i<arr.length ; i++){
            for(k=0, sum1=0 ; k<i ; sum1+=arr[k], k++);
            for(k=i+1, sum2=0 ; k<arr.length ; sum2+=arr[k], k++);
            if(sum1==sum2){
                System.out.println(i);
                break;
            }
        }
    }
}
