package chapters17;

import java.util.*;

/**
 * @author by kissx on 2016/11/14.
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        System.out.println("Low: " + low);
        System.out.println("High: " + high);
        Iterator<String> it = sortedSet.iterator();
        for (int i = 0; i <= 6; ++i) {
            if (i == 3)
                low = it.next();
            else if (i == 6)
                high = it.next();
            else
                it.next();
        }
        System.out.println("Low: " + low);
        System.out.println("High: " + high);

        System.out.println("-----------------------我是华丽的分割线-----------------------");
        SortedSet<ZiMu> mySortedSet = new TreeSet<>(new ComparatorZiMu());
        Collections.addAll(mySortedSet, new ZiMu('a'), new ZiMu('c'), new ZiMu('e'), new ZiMu('b'), new ZiMu('d'));
        System.out.println(mySortedSet);
        Comparator<? super ZiMu> comparator = mySortedSet.comparator();


    }

}

class ZiMu {
    private char c;

    public ZiMu(char c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Character && c == (char) obj;
    }

    public char getC() {
        return c;
    }

    @Override
    public String toString() {
        return String.valueOf(c);
    }
}

class ComparatorZiMu implements Comparator<ZiMu> {

    @Override
    public int compare(ZiMu o1, ZiMu o2) {
        if (o1 == o2)
            return 0;
        else if (o1.getC() > o2.getC())
            return 1;
        else
            return -1;
    }
}
