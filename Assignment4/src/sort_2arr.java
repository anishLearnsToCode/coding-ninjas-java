import java.util.Scanner;

public class sort_2arr {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n1, n2, i;

        System.out.println("Enter size of array 1");
        n1 = s.nextInt();
        System.out.println("Enter size of array 2");
        n2 = s.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int arr3[] = new int[n1+n2];

        arr_intersecion.arr_input(arr1);
        arr_intersecion.arr_input(arr2);

        for(i=0 ; i<arr3.length ; i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }else{
                arr3[i]=arr2[i];
            }
        }

        arr_sort_3.sort(arr3);

        for(i=0 ; i<arr3.length ; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
