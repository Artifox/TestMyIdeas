package codingbat.string1;

public class MakeOutWord {

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
    }

    public static String makeOutWord(String out, String word) {
        String leftSide = out.substring(0,2);
        String rightSide = out.substring(2);

        return leftSide + word + rightSide;
    }

}
