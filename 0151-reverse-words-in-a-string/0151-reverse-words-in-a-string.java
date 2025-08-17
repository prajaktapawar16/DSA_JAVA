class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

   public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
        String s1 = "the sky is blue";
        System.out.println(sol.reverseWords(s1)); // "blue is sky the"

        // Test Case 2: extra spaces
        String s2 = "hello world";
        System.out.println(sol.reverseWords(s2)); // "world hello"

        // Test Case 3: empty string or spaces
        String s3 = "     ";
        System.out.println(sol.reverseWords(s3)); // ""
    }
}
