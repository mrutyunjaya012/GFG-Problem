class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even=0;
        for(int x: arr){
            if(x%2==0){
                even++;
            }
        }
        return new int[]{arr.length-even, even};
    }
}