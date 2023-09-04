public class OccurrenceOfIs {
    public static void main(String[] args) {
        String sentence = "this is fish";
        String searchString = "is";

        int count = countIs(sentence, searchString);

        System.out.println("The number of occurrences of \"" + searchString + "\" in the sentence is: " + count);
    }

    public static int countIs(String input, String searchString) {
        int count = 0;
        int index = 0;

        while (index != -1) {
            index = input.indexOf(searchString, index);
            if (index != -1) {
                count++;
                index += searchString.length();
            }
        }

        return count;
    }
}
