import java.util.Scanner;

public class Lession_2_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("напишите строку: ");
        String s1 = scan.nextLine();
        System.out.println(s1);
        System.out.println("напишите вторую строку: ");
        String s2 = scan.nextLine();
        task1(s1, s2);
        task2(s1, s2);
    }
    public static void task1(String s1, String s2){
        System.out.println(s1.contains(s2));
    }

    public static void task2(String s1, String s2){
        System.out.println(s1.equals(s2));
    }
}
