package interview;

import org.testng.annotations.Test;

public class AtlanticMoney {

    public static void main(String[] args) throws Exception {
        sumOfArray(new int[]{1, 2, 3});
        sumOfArray(new int[]{});
        sumOfArray(new int[]{1, Integer.MAX_VALUE, 3});

        countSignChanging(new int[]{1, 100, -10, -1, 10});
        countSignChanging(new int[]{1, 2, 3, 4, 5, 6});
        countSignChanging(new int[]{-1, 2, -3, -4, 5, 6});
    }

    public static void sumOfArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if ((sum + num < Integer.MAX_VALUE) && (sum + num > 0)) {
                sum += num;
            } else {
                System.out.println("Out of bound");
            }
        }
        System.out.println(sum);
    }


    public static void countSignChanging(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length - 2; i++) {
            if ((nums[i] > 0 && nums[i + 1] < 0) || (nums[i] < 0 && nums[i + 1] > 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
