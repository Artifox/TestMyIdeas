package codingbat.warmup2;

import java.util.Arrays;

public class ArrayCount9 {
    public static void main(String[] args) {
        System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }

    public static int arrayCount9(int[] nums) {
        return Arrays.stream(nums).filter(num -> num == 9).toArray().length;
    }
}
