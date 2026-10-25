class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> mapping;
        int l = 0, res = 0;

        for (int r = 0; r < s.size(); r++) {
            if (mapping.contains(s[r])){
                l = max(mapping[s[r]] + 1, l);
            }
            mapping[s[r]] = r;
            res = max(res, r - l + 1);
        }
        return res;
    }
};
