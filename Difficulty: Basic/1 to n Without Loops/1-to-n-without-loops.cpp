class Solution {
  public:
  int i=1;
    void printTillN(int n) {
        // code here
        if(i==n+1){
            return ;
        }else{
            cout<<i<<" ";
            i++;
        }
        return printTillN(n);
        
    }
};