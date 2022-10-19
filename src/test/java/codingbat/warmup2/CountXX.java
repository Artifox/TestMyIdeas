package codingbat.warmup2;

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
    }

    static int countXX(String str) {
        int counter = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i,i+2).equals("xx")){
                counter++;
            }
        }
        return counter;
    }

}
