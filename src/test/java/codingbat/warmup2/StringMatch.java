package codingbat.warmup2;

public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("aabbccdd", "abbbxxd"));
    }

    public static int stringMatch(String a, String b) {
        int counter = 0;
        int endOfStr1 = a.length() - 1;
        int endOfStr2 = b.length() - 1;
        for (int i = 0; i < endOfStr1; i++) {
            String twoLetterString1 = a.substring(i, i + 2);
            for (int j = 0; j < endOfStr2; j++) {
                String twoLetterString2 = b.substring(j, j + 2);
                if (twoLetterString1.equals(twoLetterString2)){
                    counter++;
                }
            }
        }
        return counter;
    }

    /*
        stringMatch("xxcaazz", "xxbaaz") → 3
        stringMatch("abc", "abc") → 2
        stringMatch("abc", "axc") → 0
     */
}
