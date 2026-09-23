class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxi=arr[0];
        int sum=arr[0];
        
        for(int i=1; i<arr.length; i++){
            sum= Math.max(sum+arr[i], arr[i]);
            maxi=Math.max(maxi, sum);
        }
        return maxi;
    }
}
