package tinkoff;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class Task {
    @SneakyThrows
    @Test
    public void ruTest() {
        int[] array1 = new int[]{1, 2, 4, 5},
                array2 = new int[]{3, 3, 4},
                array3 = new int[]{2, 3, 4, 5, 6};
        System.out.println(theSameNum(array1, array2, array3));
    }

    public int theSameNum(int[] array1, int[] array2, int[] array3) throws Exception {
        int temp = 0;
        int result = 0;
        for (int i =0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    temp = array2[j];
                }
            }
        }
        for (int i = 0; i < array3.length;i++){
            if (temp == array3[i]){
                result = temp;
            }
        }
        return result;
    }












    /*int array1Length = array1.length;
        int array2Length = array2.length;
        int array3Length = array3.length;
        int counter;
        if ((array1Length > array2Length) && (array1Length > array3Length)) {
            counter = array1Length;
        } else if ((array2Length > array3Length) && (array2Length > array1Length)) {
            counter = array2Length;
        } else if ((array3Length > array1Length) && (array3Length > array2Length)) {
            counter = array3Length;
        } else throw new Exception("Fail!");
        for (int i = 0; i <= counter; i++) {
            int temp = 0;
            for (int j = 0;)
        }*/
}
