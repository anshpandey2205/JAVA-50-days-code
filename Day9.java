public class Day9 {
    public static void main(String[]args){
    int arr[]={4,5,1,2,3};
    int n=arr.length;
    int count=0;
    for(int i=0;i<n-1;i++){
    if(arr[i]>arr[i+1]){
        count++;
    }
    }
    if(arr[n-1]>arr[0]){
        count++;
    }

    if(count==1){
        System.out.println("array is sorted and rotated");
    }
    else{
        System.out.println("array is not sorted and rotated");
    }
}
}
