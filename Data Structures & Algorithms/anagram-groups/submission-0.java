class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        
        Map<String, Integer> hash = new HashMap<>();
        

        int nr_groups = -1;
        
        for(String word : strs)
        {
            

            int[] count = new int[26];

            for(char i : word.toCharArray())
            {
                count[i - 'a']++;
            }

            String key = Arrays.toString(count);

            if(hash.get(key) == null)
            {
                List<String> innerString = new ArrayList<>();
                nr_groups++;
                hash.put(key, nr_groups);
                innerString.add(word);
                sol.add(innerString);
            } else {
                int position = hash.get(key);
                sol.get(position).add(word);
            }
        }

        return sol;

    }
}
