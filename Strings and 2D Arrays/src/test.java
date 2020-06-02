import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int size, x;

        System.out.print("Size : ");
        size=s.nextInt();

        int arr[] = new int[size];

        System.out.print("\nEnter element : ");
        x=s.nextInt();

        base_cls.arr_input(arr);

        System.out.println(binary_search(arr, x));
    }

    public static int binary_search(int arr[], int x){
        int i, j, head=arr.length-1, tail=0;
        boolean flag=false;

        for(i=0 ; tail!=head ; i++){
            if(x==arr[(tail+head)/2]){
                flag=true;
                break;
            }

            else if(x>arr[(tail+head)/2]){
                tail=(tail+head)/2;
            }

            else if(x<arr[(head+tail)/2]){
                head=(head+tail)/2;
            }
        }

        if(flag)
            return (tail+head)/2;
        else
            return -1;

    }
}
