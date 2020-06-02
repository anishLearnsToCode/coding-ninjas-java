import java.util.Scanner;

public class arr_triplets {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner (System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i, x, j, k;

        System.out.print("Enter size : ");
        n=s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        System.out.print("\nEnter the element x");
        x = s.nextInt();

        for(i=0 ; i<arr.length ; i++){

            for(j=0 ; j<arr.length ; j++){
                if(j==i){
                    continue;
                }

                for(k=0 ; k<arr.length ; k++){
                    if(k==j){
                        continue;
                    }

                    if(arr[i]+arr[j]+arr[k]==x){
                        System.out.println(arr[i]+"  "+arr[j]+"  "+ arr[k]);
                    }
                }
            }
        }
    }
}
