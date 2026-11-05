// leetcode 1385: Find the Distance value Betwee Two Arrays.
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        for(int n:arr1){
            if(isValid(n,arr2,d)) cnt++;
        }
        return cnt;
    }
    boolean isValid(int n,int a[],int d){
        for(int x:a){
            if(Math.abs(x-n)<=d) return false;
        }
        return true;
    }
}