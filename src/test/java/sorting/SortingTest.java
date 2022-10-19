package sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SortingTest {
    @Test
    public void sortingTest() {
        String[] firstStringArray = {"BE_Test", "Betest"};
        String[] secondStringArray = {"Betest","BE_Test"};
        System.out.println(Arrays.stream(firstStringArray).sorted().collect(toList()).equals(secondStringArray));
    }

    @Test
    public void sorting2(){
        ArrayList<String> obtainedList = new ArrayList<>();
        obtainedList.add("BE_Test");
        obtainedList.add("Betest");

        //List<String> sortedList = obtainedList.stream().sorted().collect(Collectors.toList());
        List<String> resultList = obtainedList.stream().map(String::toUpperCase).collect(toList());

        Collections.sort(resultList, new Comparator<String>() {
            public int compare(String a, String b) {
                return Integer.signum(fixString(a).compareTo(fixString(b)));
            }
            private String fixString(String in) {
                String str = in.replace('_', '~');
                return str;
            }
        });

        //1_Update
        System.out.println(resultList);
    }

}
