package chapters15;

/**
 * 实现自己的内部链式存储
 *
 * @author by kissx on 2016/10/3.
 */
public class LinkedStack<T> {

    //利用静态内部类作为结点
    private static class Node<T> {
        private Node<T> next;   //指向下一个结点
        private T item;         //当前结点内容

        Node(Node<T> next, T item) {
            this.item = item;
            this.next = next;
        }

        void setNext(Node<T> next) {
            this.next = next;
        }

        T getItem() {
            return item;
        }

        Node<T> getNext() {
            return next;
        }
    }

    private Node<T> top = new Node<>(null, null);    //哨兵

    public void push(T item) {
        top = new Node<>(top, item);
    }

    public T pop() {
        if (top != null && top.getItem() != null) {
            Node<T> current = top;
            top = top.getNext();
            return current.getItem();
        } else
            return null;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" "))
            lss.push(s);
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

}
