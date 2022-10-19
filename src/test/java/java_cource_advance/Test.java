package java_cource_advance;

import java.util.ArrayList;
import java.util.List;

public class Test {
    @org.testng.annotations.Test
    public void test1() {
        //int[] array = new int[3];
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            arrayList.add(i);
        }

        arrayList.remove(5);
        System.out.println(arrayList);
    }
}
