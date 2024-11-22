public class reverseSentence {

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if(sentence == null){
            return "INVALID";
        }

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if(sentence.equals("")){
            return "";
        }

        // TODO: Split the sentence into words using the split method.
        // Use " " as the delimiter to match space.
        String[] words = sentence.split(" ");

        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder builder = new StringBuilder();

        // TODO: Loop through each word in the words array.
            for(String word : words){
                StringBuilder reverseWord = new StringBuilder(word);
                reverseWord.reverse();
                builder.append(reverseWord.append(" "));
            }
        // TODO: For each word, create a StringBuilder and reverse the word.
        // Append the reversed word, followed by a space, to the reversed sentence.
            String reverseSentence = builder.toString().trim();
        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
            return reverseSentence;
    }

    public static void main(String[] args) {
        reverseSentence reverseObj = new reverseSentence();
        String sentence = "Hey brother I am your daddy";
        System.out.println(reverseObj.reverseWordsInSentence(sentence));
    }
}
