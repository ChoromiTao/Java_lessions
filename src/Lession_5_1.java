import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lession_5_1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> new_map = new HashMap<>();
        System.out.println(new_map);
        for (int i: new_map.values()) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static HashMap<Integer, Integer> Create_map(){
        HashMap<Integer, Integer> new_map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            new_map.put(i, new Random().nextInt(50));
        }
        return new_map;
    }
}

// Создать словарь с ключом число и значением - случайное число. Вывести в консоль только пары в которых значение кратно двум!
// Создать два словаря, ключи это случайные числа до 25 а значения первого списка мужские имена а второго женские.
// Вывести в консоль сумму значений только пар у которых есть ключ в обоих словарях.