class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged= new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
        if(i<word1.length()){
            merged.append(word1.substring(i));
        }
        if(j<word2.length()){
            merged.append(word2.substring(j));
        }
        return merged.toString();      
        
    }
}