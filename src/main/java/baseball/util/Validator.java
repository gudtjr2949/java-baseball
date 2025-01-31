package baseball.util;

import java.util.HashSet;
import java.util.Set;

public class Validator {

    private Validator() { // 인스턴스화 방지
    }

    public static void isContainsSameInteger(String input) {
        Set<Character> set = new HashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        if (set.size() != 3) throw new IllegalArgumentException();
    }

    public static void isNotInteger(String input) {
        if (!input.matches("-?\\d+")) throw new IllegalArgumentException();
    }

    public static void isLength(String input, int length) {
        if (input.length() != length) throw new IllegalArgumentException();
    }
}
