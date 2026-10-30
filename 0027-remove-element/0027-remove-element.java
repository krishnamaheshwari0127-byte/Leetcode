class Solution {
    public int removeElement(int[] nums, int val) {
        int  n=nums.length;
        int left=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                count++;
            }
        }
        int k=n-count;
        return k;
    }
}