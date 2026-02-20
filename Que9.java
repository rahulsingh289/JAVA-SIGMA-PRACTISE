
    /* Define a class WordExample having the following description:
      Data members/instance variables: private String strdata : to store a sentence.
     Parameterized Constructor
    WordExample(String) : Accept a sentence which may be terminated by either’.’, ‘? ’or ’!’ only.
     The words may be separated by more than one blank space and are in UPPER CASE.
        Member Methods:
        void countWord(): Find the number of words beginning and ending with a vowel.
        void placeWord(): Place the words which begin and end with a vowel at the beginning, 
        followed by then remaining words as they occur in the sentence. */


            import java.util.ArrayList;
import java.util.List;

class WordExample {
    private String strdata; // stores the sentence

    // Parameterized constructor
    public WordExample(String strdata) {
        this.strdata = strdata.trim(); // remove leading/trailing spaces
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    // Method to count words beginning and ending with a vowel
    public void countWord() {
        String[] words = strdata.split("\\s+"); // split by spaces
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                if (isVowel(first) && isVowel(last)) {
                    count++;
                }
            }
        }
        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

    // Method to rearrange words: vowels first, then the rest
    public void placeWord() {
        String[] words = strdata.split("\\s+");
        List<String> vowelsList = new ArrayList<>();
        List<String> othersList = new ArrayList<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                if (isVowel(first) && isVowel(last)) {
                    vowelsList.add(word);
                } else {
                    othersList.add(word);
                }
            }
        }

        // Combine lists: vowels first
        vowelsList.addAll(othersList);

        // Join words into a sentence
        String rearranged = String.join(" ", vowelsList);
        System.out.println("Rearranged Sentence: " + rearranged);
    }
}

// Demo program
public class Que9 {
    public static void main(String[] args) {
        // Example sentence in UPPER CASE terminated by a punctuation
        String sentence = "APPLE ORANGE BANANA EGG ICE!";

        WordExample we = new WordExample(sentence);

        // Count words beginning and ending with vowel
        we.countWord();

        // Rearrange words
        we.placeWord();
    }
}