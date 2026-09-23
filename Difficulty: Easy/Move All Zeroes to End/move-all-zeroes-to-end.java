class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        // for(int i=0; i<n; i++){
        //     if(arr[i]==0){
        //         j=i;
        //     }
        // }
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]!=0){
                int temp;
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
            j++;
        }
        
        
    }
}