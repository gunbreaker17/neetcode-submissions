class Solution {
    public boolean hasDuplicate(int[] nums) {
        //hashset
        Set<Integer> hash = new HashSet<>();
        for(int i : nums)
        {
            if(hash.contains(i) == false)
                hash.add(i);
            else
                return true;
        }
        return false;
    }
}