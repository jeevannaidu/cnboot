package Basics;

import java.util.Arrays;
import java.util.List;

class Solution {

    public static int isPrefixOfWord(String sentence, String searchWord) {

        List<String> words = Arrays.asList(sentence.split(" "));

        for (String word : words) {
            if (word.length() > searchWord.length() && word.startsWith(searchWord)) {
                    return words.indexOf(word);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
    }
}
