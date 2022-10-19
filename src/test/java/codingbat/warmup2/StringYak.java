package codingbat.warmup2;

public class StringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("pakyak"));
    }

    /*public static StringBuilder stringYak(StringBuilder str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i++){
            if (str.substring(i, i+3).equals("yak")){
                result.append(str.substring(i + 3, str.length()));
            }
        }
        return result;
    }*/

    public static String stringYak(String str){
        return str.replaceAll("yak", "");
    }
}
