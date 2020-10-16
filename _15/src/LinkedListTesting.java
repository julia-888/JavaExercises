import java.util.*;

public class LinkedListTesting {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        if (linkedList.isEmpty()) {
            linkedList.add(23);
            linkedList.add(45);
            linkedList.add(90);
        }

        System.out.println(linkedList.isEmpty());

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(15);
        linkedList1.add(89);
        linkedList.add(1, 60);
        linkedList.addAll(linkedList1);
        linkedList.addAll(3, linkedList1);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "   ");
        }

        System.out.println(linkedList.contains(new Integer(60)));

        linkedList.remove(linkedList1.size() - 1);
        linkedList.remove(2);
        linkedList.remove(2);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "   ");
        }
    }
}