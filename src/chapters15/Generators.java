package chapters15;

import chapters15.util.Generator;

import java.util.*;

/**
 * @author by kissx on 2016/10/4.
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            list.add(gen.next());
        }
        return list;
    }

    public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            queue.add(gen.next());
        }
        return queue;
    }

    public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            set.add(gen.next());
        }
        return set;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> linkedList, Generator<T> gen, int n) {
        for (int i = 0; i < n; ++i) {
            linkedList.add(gen.next());
        }
        return linkedList;
    }

    public static void main(String[] args) {
        List<Coffee> list = new ArrayList<>();
        fill(list, new CoffeeGenerator(), 5);
        System.out.println(list);
        LinkedList<Coffee> linkedList = new LinkedList<>();
        fill(linkedList, new CoffeeGenerator(), 5);
        System.out.println(linkedList);
    }

}
