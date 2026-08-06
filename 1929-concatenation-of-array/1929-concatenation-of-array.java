class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []a=new int[n+n];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[n+i]=nums[i];
        }
        return a;
    }
}