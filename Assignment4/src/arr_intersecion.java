import java.util.Scanner;

public class arr_intersecion {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner (System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n, i, j;

        System.out.print("Enter size : ");
        n=s.nextInt();

        int arr1[]= new int[n];
        int arr2[]= new int[n];

        System.out.println("Enter value in array 1");
        arr_input(arr1);
        System.out.println("Enter values in array 2");
        arr_input(arr2);

        System.out.println("the intersections are : ");

        for(i=0 ; i<arr1.length; i++){
            for(j=0 ; j<arr2.length ; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
