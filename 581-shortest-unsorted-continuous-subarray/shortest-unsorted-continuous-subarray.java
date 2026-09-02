class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int minSeen=Integer.MAX_VALUE;
        int maxSeen=Integer.MIN_VALUE;
        int l=-1,r=-1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=maxSeen){
                maxSeen = nums[i];
            }
            else{
                r = i;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(nums[j]<=minSeen){
                minSeen = nums[j];
            }
            else{
                l=j;
            }
        }
        if(r==-1 && l==-1){
            return 0;
        }
        else{
            return r-l+1;
        }
    }
}