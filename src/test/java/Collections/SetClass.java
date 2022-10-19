package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        System.out.println(set);

    }
}
