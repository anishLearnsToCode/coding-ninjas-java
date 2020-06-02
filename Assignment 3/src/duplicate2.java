import java.util.Scanner;

public class duplicate2 {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("vale "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, i, j, flag;

        System.out.print("Enter the no. of elements in teh arr : ");
        n = s.nextInt();

        int arr[]=new int[n];

        arr_input(arr);

        for(i=0, flag=1 ; i<arr.length ; flag=1, i++){
            for(j=0 ; j<arr.length ; j++){
                if(i==j){
                    continue;
                }

                if(arr[i]==arr[j]){
                    flag=0;
                }
            }

            if(flag==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
