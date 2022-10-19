package codingbat.warmup2;

public class DoubleXTask {
    public static void main(String[] args) {
        doubleX("");
    }

    static boolean doubleX(String str) {
        //get to know position of first x
        //check (first x position) + 1
        //it true - return true
        //else false

        int firstXPosition = str.indexOf("x");
        if(str.length() == firstXPosition + 1){
            return false;
        }
        String secondOccuranceValue = str.substring(firstXPosition+1,firstXPosition+2);
        if(secondOccuranceValue.equals("x"))
            return true;
        return false;
    }
}
