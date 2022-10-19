package codingbat.warmup2;

public class AltPairs {
    public static void main(String[] args) {
        //System.out.println(altPairs("kitten"));
        System.out.println(altPairs("y"));
    }

    public static String altPairs(String str) {
        String finalString = "";
        for (int startSubStr = 0; startSubStr < str.length(); startSubStr += 4) {
            int endSubStr = startSubStr + 2;
            if (endSubStr > str.length()){
                endSubStr = str.length();
            }
            finalString = finalString + str.substring(startSubStr, endSubStr);
        }
        return finalString;
    }
}
