package interwiews_preparation;

import java.util.List;

public class NumbersTusk {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        printNumbers(nums);
    }

    public static void printNumbers(int[] nums){
        for (int i = 1; i <= nums.length;i++){
            for (int j = 0; j < i;j++){
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }
    }

    /*public static void main(String[] args) {
        List<Integer> values = List.of(1, 2, 3, 4, 5);
        String newValue = "";
        for (int i = 0; i < values.size(); i++) {
            String value = newValue.concat(String.valueOf(values.get(i)));
            newValue = value;
            System.out.println(value);
        }
    }*/

    /*public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }*/

}
