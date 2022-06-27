import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BalancedWordsCounter {
    public Integer count(String input) {
        if (input == null || (!input.matches("[a-zA-Z]+") && !input.equals(""))) {
            throw new RuntimeException("Invalid input string");
        }
        int countLetterInSub = 2;
        int count = 0;
        while (countLetterInSub < input.length()) {
            for (int i = 0; i <= input.length() - countLetterInSub; i++) {
                if (isBalanced(input.substring(i, i + countLetterInSub))) {
                    count++;
                }
            }
            countLetterInSub++;
        }
        return count + input.length();
    }

    private boolean isBalanced(String str) {
        Set<Character> usedLetter = new HashSet<>();
        usedLetter.addAll(str.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList()));

        if (str.length() % usedLetter.size() != 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < usedLetter.size(); i++) {
            str = str.replaceAll(String.valueOf(str.charAt(0)), "");
            if (str.length() != length - (length / usedLetter.size()) * (i + 1)) {
                return false;
            }
        }
        return true;
    }
}
