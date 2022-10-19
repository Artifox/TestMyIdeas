package codingbat.warmup2;

public class StringX {
    /*
    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/
    public static void main(String[] args) {
        System.out.println(stringX("abxxxcd"));
    }

    public static String stringX(String str) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 || i == str.length() - 1)) {
                resultString.append(str.charAt(i));
            }
            if (i > 0 && i < str.length() - 1) {
                if (!(str.charAt(i) == 'x')) {
                    resultString.append(str.charAt(i));
                }
            }
        }
        return resultString.toString();
    }

}
