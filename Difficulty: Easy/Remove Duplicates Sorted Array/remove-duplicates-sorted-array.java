class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> mpp = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        
        // for(int i=0; i<mpp.keySet(); i++){
        //     ans.add(mpp.get(i));
        // }
        for(int x:mpp.keySet()){
            ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
}
