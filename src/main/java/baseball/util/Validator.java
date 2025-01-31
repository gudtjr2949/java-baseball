package baseball.util;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    public static void isContainsSameInt(String input) {
        Set<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        if (set.size() != 3) throw new IllegalArgumentException();
    }

    public static void isNotInteger(String input) {
        if (!input.matches("-?\\d+")) throw new IllegalArgumentException();
    }

    public static void isLengthThree(String input) {
        if (input.length() != 3) throw new IllegalArgumentException();
    }
}
