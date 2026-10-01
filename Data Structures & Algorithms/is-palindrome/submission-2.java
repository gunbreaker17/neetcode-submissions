class Solution {
    public boolean notchar(char s) {
        if((s >= '0' && s <= '9') || (s >='a' && s <='z'))
            return false;
        else
            return true;
    }

    public boolean isPalindrome(String s) {
        int i, j;
        s = s.toLowerCase();
        j = s.length() - 1;
        i = 0;
        while(i < j)
        {
            
            if (notchar(s.charAt(i)))
                i++;
            else{
                if (notchar(s.charAt(j)))
                    j--;
                else{
                    if ((s.charAt(i)) != (s.charAt(j)))
                        return false;
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}
