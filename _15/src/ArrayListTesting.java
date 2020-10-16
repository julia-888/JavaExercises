import java.util.*;

public class ArrayListTesting {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        if (arrayList.isEmpty()) {
            arrayList.add(56);
            arrayList.add(98);
            arrayList.add(35);
        }

        System.out.println(arrayList.isEmpty());

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(34);
        arrayList1.add(68);
        arrayList.add(3, 78);
        arrayList.addAll(arrayList1);
        arrayList.addAll(1, arrayList1);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "   ");
        }

        System.out.println(arrayList.contains(new Integer(34)));

        arrayList.remove(arrayList1.size() - 1);
        arrayList.remove(3);
        arrayList.remove(3);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "   ");
        }
    }
}
