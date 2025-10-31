import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,2,4,2,5,6};
        int n=arr.length;
        System.out.println("enter the element");
        int element=sc.nextInt();
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==element){
                count++;
            }
        }
        System.out.println("element are repeated "+count+" times");
        
    }
}
