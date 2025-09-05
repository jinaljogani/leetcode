// here we use three pointer to iterate throw array and store result , whre sum is equls to desired val 0
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int val=0;
        Arrays.sort(nums);
        Set<List<Integer>> hs =new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int j=i+1;// left side pointer 
            int k=nums.length-1; // right end pointer

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum==val){
                    hs.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<val){
                    j++; // array is sorted so , iteration can increase sum value
                }
                else{
                    k--; // to  dec sum val
                }
            }
           
        }
         result.addAll(hs);
            return result;
    }
}