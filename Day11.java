public class Day11 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, -1, 4};
        int n = arr.length;

        rearrange(arr, n);

        System.out.println("Rearranged array:");
        for (int num : arr)
            System.out.print(num + " ");
    }

    static void rearrange(int arr[], int n) {
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

        // Step 1: Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos[p++] = arr[i];
            else
                neg[q++] = arr[i];
        }

        // Step 2: Put them alternately into arr[]
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            arr[k++] = pos[i++]; // add positive
            arr[k++] = neg[j++]; // add negative
        }

        // Step 3: If any left, add them
        while (i < p)
            arr[k++] = pos[i++];

        while (j < q)
            arr[k++] = neg[j++];
    }
}
