// Sentence Processor with Exception Handling

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        try {
            if(sentence.isBlank()) {
                throw new IllegalArgumentException("Your input is empty!");
            }

            String words[] = sentence.split("\\s+");
            if(words.length < 2) {
                throw new IllegalArgumentException("The sentence must be of two words atleast!");
            }

            // Modifying the sentence
            StringBuilder modifiedSentence = new StringBuilder();
            for(int i = words.length - 1; i >= 0; i--) {
                modifiedSentence.append(words[i]);
                if(i > 0) {
                    modifiedSentence.append(" ");
                }
            }

            System.out.println("Your original sentence: " + sentence);
            System.out.println("Modified Sentence: " + modifiedSentence);


        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
