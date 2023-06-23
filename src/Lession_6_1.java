import java.util.*;

public class Lession_6_1 {
    public static void main(String[] Args){
        SetImitation setImitation = new SetImitation();
        System.out.println(setImitation.add(9));
        System.out.println(setImitation.add(9));
        System.out.println(setImitation.add(2));
        System.out.println(setImitation.size());
        System.out.println(setImitation.delete(9));
        System.out.println(setImitation.delete(9));
        System.out.println(setImitation.size());
        System.out.println(setImitation.isEmpty());
        System.out.println(setImitation.contains(9));
        System.out.println(setImitation.contains(2));
        for (int i = 0; i < 10; i++) {
            setImitation.add(new Random().nextInt(1000));
        }
        Iterator<Integer> iterator = setImitation.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(setImitation.getElementByIndex(3));

    }

}
class SetImitation<E> {
    private HashMap<E, Object> map = new HashMap<>();
    private static final Object OBJECT = new Object();
    public boolean add(E num) {
        return map.put(num, OBJECT) == null;
    }
    public boolean delete(E num){
        return map.remove(num,OBJECT);
    }
    public int size(){
        return map.size();
    }
    public boolean isEmpty(){
        return map.isEmpty();
    }
    public boolean contains(Object num){
        return map.containsKey(num);
    }
    public Iterator<E> iterator(){
        return map.keySet().iterator();
    }

    public E getElementByIndex(int index){
        E[] mapArray = (E[]) map.keySet().toArray();
        return mapArray[index];
    }
}