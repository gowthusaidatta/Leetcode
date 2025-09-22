class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        boolean[] broken = new  boolean[26];
        for(char ch : brokenLetters.toCharArray()){
            broken[ch - 'a'] = true;   // marking broken char
        }

        int validWordCount = 0;
        boolean validWord = true;

        for(char ch : text.toCharArray()){
            if(ch == ' '){
                if(validWord == true) validWordCount++;  
                validWord = true;
                
            }else if(broken[ch - 'a']){
                    validWord = false; // if broken char appears 
            }

        }
        if(validWord) validWordCount++;
        return validWordCount;
        
    }
}