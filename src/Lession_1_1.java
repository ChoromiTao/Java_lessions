import java.util.Scanner;

public class Lession_1_1 {
    public static void main (String[] args){
        Scanner new_scanner = new Scanner(System.in);
        System.out.println("Введите максимальное число: ");
        int maximal_limit = Integer.parseInt(new_scanner.nextLine());
        printPrimes(maximal_limit);
    }

    public static void printPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1]; // создаем массив для хранения простых чисел
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // заполняем массив значениями true
        }
        for (int i = 2; i * i <= n; i++) { // проходим по всем числам от 2 до корня из n
            if (isPrime[i]) { // если текущее число простое
                for (int j = i * i; j <= n; j += i) { // то проходим по всем кратным ему числам и помечаем их как не простые
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) { // выводим все простые числа до n
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}