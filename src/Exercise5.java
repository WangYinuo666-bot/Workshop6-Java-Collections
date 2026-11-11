/*
 * Workshop 6 - Exercise 5 (Medium)
 * Search Engine: search through an array of 10 paragraphs.
 * Output the index and the paragraph of every match, or a message saying
 * the phrase was not found.
 */
public class Exercise5 {

    public static void main(String[] args) {

        String[] paragraphs = {
            "Lose all the weight you want.",
            "I can't I must work",
            "That would be like a keyword search.",
            "This would be Victoria.",
            "Join the party.",
            "To be or not to be.",
            "That is a question to test keyword search.",
            "Can you find a needle in a hay stack?",
            "This could be the last paragraph, but its not.",
            "Ada Lovelace is the worlds first programmer as of 1860."
        };

        String phrase = (args.length > 0) ? args[0] : "keyword search";

        System.out.println("Search phrase: \"" + phrase + "\"");
        System.out.println("---------------------------------------------");

        int found = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            // ignore upper/lower case so the search is not case sensitive
            if (paragraphs[i].toLowerCase().contains(phrase.toLowerCase())) {
                System.out.println("Found at index " + i + ": " + paragraphs[i]);
                found++;
            }
        }

        System.out.println("---------------------------------------------");
        if (found == 0) {
            System.out.println("The phrase \"" + phrase + "\" was NOT found in any paragraph.");
        } else {
            System.out.println(found + " paragraph(s) contained the phrase.");
        }
    }
}
