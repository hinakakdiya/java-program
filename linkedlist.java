import java.util.*;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> a = new LinkedList<String>();

        a.add("Hello");
        a.add("How");
        a.add("are");
        a.add("You");
        a.add("?");
        System.out.println(a);

        a.addFirst("hi dear");
        System.out.println(a);

        a.addLast("good");
        System.out.println(a);

        a.removeFirst();
        System.out.println(a);

        a.removeLast();
        System.out.println(a);

        System.out.println(a.getFirst());

        System.out.println(a.getLast());

    }

}
