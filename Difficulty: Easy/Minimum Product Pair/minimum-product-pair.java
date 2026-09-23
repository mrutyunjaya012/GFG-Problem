class Solution {
    public long printMinimumProduct(int arr[]) {
        // code here
        long  prod;
        Arrays.sort(arr);
        prod=arr[0] * arr[1];
        return prod;
        
    }
}
