class Solution {
    public boolean isAnagram(String s, String t) {
        //beginner - search each element from s and take it down in t. (O(n^2)) time, no more space required
        // 2 hash-maps for each of them

        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> count1 = new HashMap<>();
        HashMap<Character, Integer> count2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(count1.get(s.charAt(i)) == null)
                count1.put(s.charAt(i), 1);
            else
                count1.put(s.charAt(i), count1.get(s.charAt(i)) + 1);
            
            if(count2.get(t.charAt(i)) == null)
                count2.put(t.charAt(i), 1);
            else
                count2.put(t.charAt(i), count2.get(t.charAt(i)) + 1);
        }

        if(count1.equals(count2))
            return true;
        return false;
    }
}
