class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer>mpp= new HashMap<>();
        for(int x: b){
            mpp.put(x, mpp.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>ans= new ArrayList<>();
        
        for(int x: a){
            if(mpp.containsKey(x) && mpp.get(x)>0){
                ans.add(x);
                mpp.put(x, mpp.get(x)-1);
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
}