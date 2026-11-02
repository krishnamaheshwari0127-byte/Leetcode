class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else{
            int nn=n*2;
            return nn;
        }
    }
}