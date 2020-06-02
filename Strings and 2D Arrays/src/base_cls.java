import java.util.Scanner;

import static java.lang.Math.pow;

public class base_cls {

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

        for(i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+"  ");
        }
    }


    public static void arr_swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void arr_cycle(int index1, int index2, int arr[]){
        int i, j;

        for(i=index2 ; i>index1 ; i--){
            arr[i]=arr[i-1];
        }
    }

    public static int arr_min(int index1, int index2, int arr[]){
        int i, k;

        for(i=index1, k=i ; i<index2 ; i++){
            if(arr[i]<arr[k]){
                k=i;
            }
        }

        return k;
    }

    public static int intlen(int n){
        int i;

        for(i=0 ; n!=0 ; n/=10, i++);

        return i;
    }

    public static int digit (int i, int n){
        int j;

        j=(int)(n/pow(10, intlen(n)-i-1));
        j=j%10;

        return j;
    }


    public static void bubble_sort(int arr[]){
        int i, j;

        for(i=0 ; i<arr.length-1 ; i++){
            for(j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    arr_swap(i, j, arr);
                }
            }
        }
    }

    public static void insertion_sort(int arr[]){
        int i, j, temp;

        for(i=1 ; i<arr.length ; i++){
            for(j=0 ; j<i ; j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr_cycle(j, i, arr);
                    arr[j]=temp;
                }
            }
        }
    }

    public static void selection_sort(int arr[]){
        int i, j, k;

        for(i=1 ; i<arr.length ; i++){
            arr_swap(i-1, arr_min(i, arr.length, arr), arr);
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;

        System.out.print("Enter size : ");
        n=s.nextInt();

        int arr[] = new int[n];

        arr_input(arr);

        selection_sort(arr);

        arr_display(arr);

        n=s.nextInt();
        i=s.nextInt();

        System.out.println(digit(i, n));

    }
}
