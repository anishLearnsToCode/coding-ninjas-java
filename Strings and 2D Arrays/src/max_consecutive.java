import java.util.Scanner;

public class max_consecutive {

    public static int consec(int arr[]){
        base_cls.bubble_sort(arr);

        int i, cur, a, k, j;

        for(i=0, cur=arr[arr.length-1]+1, a=1, k=1 ; i<arr.length-1 ; i++){

            if(arr[i]!=cur){
                cur=arr[i];

                for(j=i+1 ; ((arr[j]<=(arr[i]+a))&&(j<arr.length)); j++){
                    if(arr[j]==arr[i]+1)
                        a++;
                }

                if(a>k)
                    k=a;
            }

        }

        return k;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, n, j;

        n=s.nextInt();

        int arr[]=new int[n];

        for(i=0 ; i<arr.length ; i++){
            arr[i]=s.nextInt();
        }

        j=consec(arr);

        System.out.println(j);
    }
}
