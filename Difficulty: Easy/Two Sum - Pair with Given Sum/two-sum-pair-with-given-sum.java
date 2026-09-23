class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer>set = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            int req=target-arr[i];
            if(set.contains(req)){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
        
    }
}