class Solution {
    public List<String> letterCombinations(String digits) {
        // Mapping of digits to corresponding letters
        String[] digitToLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        comb(digits, 0, "", res,digitToLetters);
        return res;
    }

    public void comb(String digits, int i, String pat, List<String> res, String[] digitToLetters) {
        if(pat.length()==digits.length()) {
                res.add(pat);
                return;
        }

        for(int j=0; j<digitToLetters[digits.charAt(i)-'0'].length(); j++) {
            comb(digits, i+1, pat+digitToLetters[digits.charAt(i) - '0'].charAt(j), res, digitToLetters);
        }
        
    }
} 
