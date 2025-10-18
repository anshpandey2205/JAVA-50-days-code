public class Day5 {
    public static void main(String args[]){
        int []arr={-1,3,-4,7,-8,9,5};
        int n=arr.length;
        int left=0;
        int right=n-1;

        System.out.println("original array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        while(left<=right){

            if(arr[left]<0 && arr[right]<0){
                left++;
            }
            if(arr[left]>=0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }else if(arr[left]>=0 && arr[right]>=0){
                right--;
            }else{
                left++;
                right--;
            }
        }
        System.out.println("rearranged array = ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
