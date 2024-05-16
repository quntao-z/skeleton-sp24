import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int answer = 0;
        for (Integer number : L ) {
            answer += number;
        }
        return answer;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> answer = new ArrayList<>();
        for (Integer number : L ) {
            if (number % 2 == 0) {
                answer.add(number);
            }
        }
        return answer;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> answer = new ArrayList<>();
        for (Integer number : L1 ) {
            if (L2.contains(number)) {
                answer.add(number);
            }
        }
        return answer;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String word : words) {
            char[] chars = word.toCharArray();
            for(char letter : chars) {
                if (letter == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
