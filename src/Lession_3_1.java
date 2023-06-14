import java.util.*;

public class Lession_3_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

//        Object object;
//        list.add(1);        //Integer
//        list.add(.324);     //Double
//        list.add("РџСЂРёРІРµС‚!");    //String
//        list.add(true); //Boolean
//
//        if (list.get(2) instanceof String) {
//            String a = (String) list.get(2);
//        }

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
            list1.add(new Random().nextInt(15));
        }

//        list.add(list.size()/2, 1);
//        list.addAll(list1);
//        list.addAll(0, list1);
//        if (list.isEmpty());
//        list.clear();
//        list.set(0, 1234);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello!");
        list2.add("Hello!");
        list2.remove(0);
        list2.remove("Hello!");
//        String as = list2.get(0);
        if (list2.contains("Hello!"));
//        list.trimToSize();
//        list.ensureCapacity(100);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (int i: list) {
//            System.out.println(i);
//        }
//
//        ListIterator<Integer> iterator = list.listIterator(list.size()-1);
//        while (iterator.hasPrevious()){
//            int i = iterator.previous();
//            iterator.nextIndex();
//            System.out.println(i);
//            iterator.remove();
//        }

//        list.forEach(n -> System.out.println(n));

//        System.out.println(list.size());

        System.out.println(list);
        System.out.println(list1);
        System.out.println("-".repeat(16));

//        list.retainAll(list1);
        list.removeAll(list1);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(list);

        List<Integer> list3 = list1.subList(0, list1.size()/2);
        System.out.println(list3);

        list1.clear();
        list.forEach(n -> list1.add(0, n));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(null);

    }
}
