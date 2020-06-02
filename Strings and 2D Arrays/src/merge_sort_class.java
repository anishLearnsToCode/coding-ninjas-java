import java.util.Scanner;

public class merge_sort_class {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int size, size2;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr[] = new int[size];

        //System.out.print("Size 2 : ");
        //size2=s.nextInt();

        int arr2[] = new int[size];
        //int arr3[] = new int[size+size2];

        base_cls.arr_input(arr);
        //base_cls.arr_input(arr2);
        arr2 = merge_sort(arr);
        //arr3 = merge(arr, arr2);
        base_cls.arr_display(arr2);
    }

    public static int[] merge_sort(int arr[]){

        int i, tail=0, head=arr.length;

        if(arr.length==1){
            return arr;
        }

        int arr1[] = new int[(head+tail)/2];
        int arr2[] = new int[(head+tail+1)/2];

        for(i=0 ; i<(head+tail)/2 ; arr1[i]=arr[i], i++);
        for(i=(head+tail)/2 ; i<head ; arr2[i-(tail+head)/2]=arr[i], i++);

        //System.out.println("");
        //base_cls.arr_display(arr1);
        //System.out.println("");
        //base_cls.arr_display(arr2);

        arr1=merge_sort(arr1);
        arr2=merge_sort(arr2);

        return merge(arr1, arr2);
    }

    public static int[] merge(int arr1[], int arr2[]){
        int i, j1, j2, k, p;
        int output[] = new int[arr1.length+arr2.length];
        boolean flag;

        for(i=0, j1=0, j2=0, flag=false ; i<output.length ; i++){
            if(arr1[j1]<arr2[j2]){
                output[i]=arr1[j1];
                j1++;
            }

            else if(arr2[j2]<=arr1[j1]){
                output[i]=arr2[j2];
                j2++;
            }

            if((j1==arr1.length) || (j2==arr2.length)){
                flag=true;
                break;
            }
        }

        if(flag){

            if(j2==arr2.length) {
                for (; j1 < arr1.length; j1++) {
                    for (k = j1 + 1, p=j1 ; k < arr1.length; k++) {
                        if (arr1[k] < arr1[p]) {
                            p = k;
                        }
                    }

                    output[j1+j2]=arr1[p];
                }


            }

            else{
                for( ; j2<arr2.length ; j2++){
                    for(k=j2+1 , p=j2 ; k<arr2.length ; k++){
                        if(arr2[k]<arr2[p]){
                            p = k;
                        }
                    }

                    output[j1+j2]=arr2[p];
                }
            }
        }

        return output;

    }
}