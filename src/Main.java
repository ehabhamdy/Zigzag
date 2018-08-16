import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(convert("ehabhamdy", 3));
    }

    /* Modeling of a string with 15 characters in a zigzag shape
     * using the characters position
     *************************************************************
     *        0      6        12
     *        1   5  7     11 13
     *        2 4    8  10    14
     *        3      9        15
     * */

    public final static String convert(String s, int rows) {
        int length = s.length();

        // Check for edge cases
        if (length <= rows || rows <= 1) {
            return s;
        }

        ArrayList<Character> result = new ArrayList<>();
        int fixedGap = (rows - 1) * 2;

        for (int i = 0; i < rows; i++) {
            int step = fixedGap - 2 * i;
            for (int j = i; j < length; j += fixedGap) {
                result.add(s.charAt(j));

                /*
                 * If we are in a middle row add the intermediary characters
                 * between the parallel characters in the zigzag.
                 * */
                if (step > 0 && step < fixedGap && j + step < length) {
                    result.add(s.charAt(j + step));
                }
            }
        }

        return getStringRepresentation(result);
    }

    public final static String getStringRepresentation(ArrayList<Character> list) {
        StringBuilder builder = new StringBuilder(list.size());
        for (Character ch : list) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
