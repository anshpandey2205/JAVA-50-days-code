public class Day7 {
    static void rotateByOne(int []arr){
        int n=arr.length;
        int last=arr[n-1];

        // shift elements toward right

        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        // place last element at first position
        arr[0]=last;
    }
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6};
        int n=arr.length;
        rotateByOne(arr);
        System.out.println("rotated array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);

        }
    }
    
}
