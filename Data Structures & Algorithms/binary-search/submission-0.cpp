class Solution {
public:
    int search(vector<int>& nums, int target) {
        int low = 0, high = nums.size() - 1;
        int medium;

        while (low <= high){
            medium = (low + high) / 2;
            if (nums[medium] < target){
                low = medium + 1;
            } else if (nums[medium] > target){
                high = medium - 1;
            } else
                return medium;
        }
        
        return -1;
    }
};
