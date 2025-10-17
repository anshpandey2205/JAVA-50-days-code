import java.util.*;
public class Day3{
    public static void main(String args[]){
        int n,k,temp;
        System.out.println("enter the number of element");
        Scanner sc=new Scanner(System.in);
         n= sc.nextInt();
         int[]arr=new int[n];

        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }

        System.out.println("enter the value of k");
         k= sc.nextInt();

         //  Sort the array
         Arrays.sort(arr);

         int kthMin=arr[k-1];
         int kthMax=arr[n-k];

         System.out.print("th minimum value is ="+ kthMin);
         System.out.print("th maximum value is ="+ kthMax);

    }
}