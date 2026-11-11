/*
 * Workshop 6 - Exercise 3 (Medium)
 * Reverse the sequence of letters in each word of a sentence using loops and arrays.
 *   "To be or not to be."  ->  "oT eb ro ton ot eb."
 * Punctuation stays where it is, only the letters of each word are reversed.
 */
public class Exercise3 {

    public static void main(String[] args) {

        String sentence = "To be or not to be.";

        System.out.println("Original : " + sentence);
        System.out.println("Reversed : " + reverseWords(sentence));
    }

    // Split the sentence into words (array), then reverse the letters of
    // every word character by character with loops.
    public static String reverseWords(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int w = 0; w < words.length; w++) {

            String word = words[w];

            // find where the letters end, e.g. "be." -> letters = "be"
            int letterEnd = word.length();
            while (letterEnd > 0 && !Character.isLetter(word.charAt(letterEnd - 1))) {
                letterEnd--;
            }

            char[] letters = new char[letterEnd];
            for (int i = 0; i < letterEnd; i++) {
                letters[i] = word.charAt(letterEnd - 1 - i);   // reverse order
            }

            String reversedWord = "";
            for (int i = 0; i < letters.length; i++) {
                reversedWord = reversedWord + letters[i];
            }

            // put the punctuation back on the end
            for (int i = letterEnd; i < word.length(); i++) {
                reversedWord = reversedWord + word.charAt(i);
            }

            if (w > 0) {
                result = result + " ";
            }
            result = result + reversedWord;
        }
        return result;
    }
}
