package Collectons;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsDemo {

    @Test
    public void collectionsTest() {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.remove(4);
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : collection) {
            System.out.println(o);
        }
    }

    @Test
    public void arrayListDemo() {
        List collection = new ArrayList();
        collection.add(1);
        collection.set(0, 12);

        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }

    @Test
    public void queueDemo() {
        Queue queue = new PriorityQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.poll());
        }
    }

    @Test
    public void mapDemo(){
        Map map = new HashMap();
        map.put("1", new ArrayList<String>(Stream.of("String1","String2").collect(Collectors.toList())));
    }
}
