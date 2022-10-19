package codingbat.warmup2;

import java.util.stream.Stream;

public class NoTriples {
    public static void main(String[] args) {
        System.out.println(noTriples(Stream.of(1, 1, 2, 2, 1).toArray()));
    }

    public static boolean noTriples(Object[] nums) {
        //go through an array
        //if array[i], array[i+1] and array[i+2] are equal
        //then DONE
        //but we have to chech is i+1 < array.length
        //to avoid IndexOutOfBoundExeption
        if(nums.length < 3){
            return false;
        }

        for(int i = 0; i <= nums.length; i++){
            if (nums.length < (i+2)){
                break;
            }
            if(nums[i+1] == nums[i] && nums[i+2] == nums[i]){
                return true;
            }
        }
        return true;
    }

}
