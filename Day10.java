import java.util.Scanner;
public class Day10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of element");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("leaders in an array is ");
        int max_right=arr[n-1];
        System.out.println(max_right+" ");

        for(int i=n-2;i>=0;i--){
            if(arr[i]>max_right){
                max_right=arr[i];
                System.out.println(max_right+" ");
            }
        }
    }
}
