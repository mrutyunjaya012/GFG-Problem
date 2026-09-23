class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length + 1;
        long  sum = (long) n * (n+1)/2;
        long  sum1=0;
        for(int x:arr){
            sum1+=x;
        }
        return  (int)(sum- sum1);
        
    }
}

