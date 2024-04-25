public class StringPatterns {
    /**
     * Returns the String that results when letter and pattern are
     * compared, as described in part (a)
     * <p>
     * Precondition: letter consists of one uppercase letter.
     * pattern has at least 2 letters and all letters are uppercase
     * and unique.
     */
    public static String letterAndPattern(String letter, String pattern) {
        if (pattern.contains(letter)) {
            return letter;
        }
        String reverse = "";
        for (int i = pattern.length(); i > 0; i--) {
            reverse += pattern.substring(i - 1, i);
        }
        return reverse;
    }
}
