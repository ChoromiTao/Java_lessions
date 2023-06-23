import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Lession_5_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> Men = fill_map(1);
        HashMap<Integer, String> Women = fill_map(2);
        int count = 1;
        for (int n: Men.keySet()) {
            if (Women.containsKey(n)){
                System.out.println(Men.get(n) + "+" + Women.get(n));
            }
        }
    }
    public static HashMap<Integer, String> fill_map(int count){
        String encoding = System.getProperty("console.encoding", "UTF-8");
        Scanner new_scanner = new Scanner(System.in);
        HashMap<Integer, String> new_map = new HashMap<>();
        if (count == 1) {
            for (int i = 0; i < 10; i++) {
                String new_name = new_scanner.nextLine();
                new_map.put(new Random().nextInt(1, 25), new_name);
            }
        }
        else if (count == 2) {
            for (int i = 10; i < 20; i++) {
                String new_name = new_scanner.nextLine();
                new_map.put(new Random().nextInt(1, 25), new_name);
            }
        }
        return new_map;
    }
    
}
