package codingbat.warmup2;

public class ArrayFront9 {
    public static void main(String[] args) {
        /*System.out.println(arrayFront9(new int[]{1, 9, 9, 3, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));*/
        System.out.println(arrayFront9(new int[]{9, 2, 3}));
    }

    public static boolean arrayFront9(int[] nums) {
        if (nums.length == 0) return false;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9 && i < 4){
                return true;
            }
        }
        return false;
    }

}
