class Solution {
    public int[] twoSum(int[] nums, int target) {
        //easy - double check with an i and a j= i+1
        //harder - hashmap <integer, integer>  the difference

        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++ )
        {
            if(hash.get(target - nums[i]) == null)
                hash.put(nums[i], i);
            else
                return new int[] {hash.get(target - nums[i]),i};
        }
        return new int[] {};
    }
}
