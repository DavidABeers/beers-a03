package baseline;

public class Solution24 {
    //get a string from the user
    String getUserString(String prompt){
        // print prompt
        // return scanned input
    }
    // check that words are same length
    Boolean isWordLengthIdentical(String word1, String word2){
        // return the comparison of the string lengths

    }
    // check every character in word1 for a matching character in word2
    Boolean isAnagram(String word1, String word2){
        // make a flag and set it to true
        if(this.isWordLengthIdentical(word1, word2)){
            // compare each substring of word1 with every substring with word2
            // upon finding a match, reconstruct word2 omitting the matching character
            // if a character is not found, set flag to false and break the loop
            // return flag
        }
    }
    // print the output based on whether isAnagram is true or false
    public void output(Boolean isAnagram, String word1, String word2){
        // if anagrams, print word1 and word2 are anagram
        // else, print not anagrams
    }
    public static void main(String []args){
        Solution24 sol = new Solution24();

        // ask user for the first word
        String word1 = sol.getUserString("");
        // ask user for the second word
        String word2 = sol.getUserString("");

    }

}
