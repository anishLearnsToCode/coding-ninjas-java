import java.util.Scanner;

public class bin_search {

    public static void arr_input(int arr[]){
        Scanner s = new Scanner(System.in);
        int i;

        for(i=0 ; i<arr.length ; i++){
            System.out.print("Value "+(i+1)+" : ");
            arr[i]=s.nextInt();
        }
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

    public static void arr_display(int arr[]){
        int i;

        for(i=0 ; i<arr.length ; System.out.print(arr[i]+"  "), i++ );
    }

    public static int search(int k, int arr[]){
        int head, tail, flag, i;

        for(head = arr.length-1, tail=0, flag=1, i=0 ; (head!=tail)&&(i<arr.length) ;i++ ){
            if(k==arr[(head+tail)/2]) {
                flag =0;
                return 1;
            }
            else if(k>arr[(head+tail)/2]){
                tail=(head+tail)/2;
            }
            else if(k<arr[(head+tail)/2]){
                head=(head+tail)/2;
            }
        }

        if(flag==1){
            return 0;
        }else
            return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, n;

        System.out.print("Enter the size : ");
        n=s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        System.out.print("\nEnter the element you wish to search for : ");
        i=s.nextInt();

        sort(arr);

        if(search(i, arr)==1){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}
