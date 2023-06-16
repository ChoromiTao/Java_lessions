import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Lession_4_1 {
    public static void main(String[] args) {
        String[] myStr;
        ArrayList<String[]> arrayStrings = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        // Существет проблемма с русскими символами в Scanner
        String encoding = System.getProperty("console.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in, encoding);

        while (true) {
            System.out.println("-".repeat(20));
            System.out.println(
                    "Введите строки в формате:\nФамилия Имя Отчество Возраст Пол\nЧтобы закончить ввод данных - введите пустую строку.");
            System.out.println("Введите строку: ");
            myStr = GetArrayString(scanner.nextLine());

            if (myStr == null)
                break;
//            if (myStr[0].equals(""))
//                break;          // выход из ввода данных вовзращаем null;
            arrayStrings.add(myStr);
            ages.add(Integer.parseInt(myStr[3]));
            //

        }
        PrintArray(arrayStrings, -1);
        scanner.close();
    }
//        public static ArrayList<Integer> minimal_maximal_indexes(ArrayList<String[]> arrayList, int sortrby){
//
//            return new_ages;
//        }
        public static void PrintArray(ArrayList<String[]> arrayList, int sortby){
            arrayList.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    int r =  Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                    return r*sortby;
                }
            });
            for (String[] myStr: arrayList) {
                System.out.println(String.format("%s %s. %s. %s %s",myStr[0], myStr[1].charAt(0), myStr[2].charAt(0), myStr[3],myStr[4]));
            }
        }
        public static String[] GetArrayString(String str) {
            String[] result = null;
            result = str.strip().split(" ");
                if (result.length != 5) {
                    return null;
                }
            return result;
        }
}
