import java.util.Scanner;

public class sum_pairs {

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
        int n, a, i, j;

        System.out.print("Enter the no. of elements in array : ");
        n = s.nextInt();

        int arr[]=new int[n];

        arr_input(arr);

        System.out.print("\nEnter the element that you wish to check for : ");
        a = s.nextInt();

        for(i=0 ; i<arr.length ; i++) {
            for(j=i+1 ; j<arr.length ; j++){
                if(j==i)
                    continue;

                if(arr[i]+arr[j]==a) {
                    System.out.println(arr[i]+"  "+arr[j]);
                }
            }
        }
    }
}
