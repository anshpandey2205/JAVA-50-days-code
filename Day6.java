public class Day6 {
    public static void main(String args[]){
        int []A={1,2,3,4,5};
        int []B={4,5,6,7,8};
        int n1=A.length;
        int n2=B.length;
        int[]union=new int[n1+n2];
        int[]intersection=new int[Math.min(n1, n2)];
        int k=0;
        int l=0;
        boolean found;

                                   //  UNION 

        //  PRINT ALL ELEMENT OF A

        for(int i=0;i<n1;i++){
            union[k++]=A[i];
        }

        // ADD ELEMENT OF B THAT ARE NOT IN A

        for(int i=0;i<n1;i++){
            found =false;
            for(int j=0;j<n2;j++){
                if(B[i]==A[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                union[k++]=B[i];
            }
        }

                                  //  INTERSECTION

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(A[i]==B[j]){
                    intersection[l++]=A[i];
                    break;
                }
            }
        }
        
        System.out.println("Union = ");
        for(int i=0;i<k;i++){
            System.out.print(union[i]+" ");
        }
        System.out.println();
        System.out.println("intersection = ");
        for(int i=0;i<l;i++){
            System.out.println(intersection[i]+" ");
        }
        System.out.println();
    }
}
