import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Lession_4_1 {
    public static void main(String[] args) {
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> surNames = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();
        // Существет проблема с русскими символами в Scanner
        String encoding = System.getProperty("console.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in, encoding);

        String[] inputFieldNames = new String[]{"ФИО", "Пол", "Возраст"};
        String[] inputFields = new String[inputFieldNames.length];

        boolean input = true;
        boolean add;
        while (input) {
            add = true;

            for (int i = 0; i < inputFields.length; i++) {
//                проверяем ввод пустой строки
                do {
                    inputFields[i] = inputData(scanner, inputFieldNames[i]);
                } while (inputFields[i].length() == 0);

//                выход или вывод
                if (inputFields[i].equals("exit")) {
                    input = false;
                    add = false;
                    break;
                } else if (inputFields[i].equals("show")) {
                    add = false;
                    System.out.println();
                    showPersons(lastNames, firstNames, surNames, ages, genders);
                    System.out.println();
                    showSortPersons(lastNames, firstNames, surNames, ages, genders);
                    break;
                }
            }

            if (add) {
                String[] fullnameArr = inputFields[0].split(" ");
                lastNames.add(fullnameArr[0]);
                firstNames.add(fullnameArr[1]);
                surNames.add(fullnameArr[2]);
                genders.add(inputFields[1]);

                if (isDigit(inputFields[2])) {
                    ages.add(Integer.parseInt(inputFields[2]));
                } else {
                    ages.add(0);
                }
            }
        }
    }
    public static void showPersons(ArrayList<String> lastNames, ArrayList<String> firstNames, ArrayList<String> surNames,
                                   ArrayList<Integer> ages, ArrayList<String> genders) {
        for (int i = 0; i < lastNames.size(); i++) {
            System.out.println(lastNames.get(i) + " " + firstNames.get(i).charAt(0) + "." + surNames.get(i).charAt(0) + ". "
                    + ages.get(i) + " " + genders.get(i));
        }
    }

    public static void showSortPersons(ArrayList<String> lastNames, ArrayList<String> firstNames, ArrayList<String> surNames,
                                       ArrayList<Integer> ages, ArrayList<String> genders) {
        int[] indexes = getSortIndexes(ages, genders);

        for (int index : indexes) {
            System.out.println(lastNames.get(index) + " " + firstNames.get(index).charAt(0) + "." + surNames.get(index).charAt(0) + ". "
                    + ages.get(index) + " " + genders.get(index));
        }
    }

    public static String inputData(Scanner scanner, String text) {
        System.out.print(text + ": ");
        if (scanner.hasNext())
            return scanner.nextLine();
        else
            return "";
    }

    public static int[] getSortIndexes(ArrayList<Integer> ages, ArrayList<String> genders) {
        int[] indexes = new int[ages.size()];
        for (int i = 0; i < ages.size(); i++) {
            indexes[i] = i;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < indexes.length - 1; i++) {
//              либо по полу, если они разные и не в том порядке
//              либо по возрасту, если пол один
                if ((genders.get(indexes[i]).equals("Женский") && genders.get(indexes[i + 1]).equals("Мужской"))
                        || ((genders.get(indexes[i]).equals(genders.get(indexes[i + 1]))) && (ages.get(indexes[i]) > ages.get(indexes[i + 1])))) {
                    isSorted = false;
                    int tmp = indexes[i];
                    indexes[i] = indexes[i + 1];
                    indexes[i + 1] = tmp;
                }
            }
        }

        return indexes;
    }

    private static boolean isDigit(String str) throws NumberFormatException {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}