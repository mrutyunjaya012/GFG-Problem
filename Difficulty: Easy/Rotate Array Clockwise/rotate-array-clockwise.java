class Solution {
    public void reverseArray(int []arr, int start , int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(arr ==null || n==0) return;
        k=k%n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        
    }
}