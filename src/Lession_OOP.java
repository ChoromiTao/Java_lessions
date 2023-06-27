import java.util.Random;
public class Lession_OOP {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Cat cat1 = new Cat("Persik");
        Tiger tiger = new Tiger("Tiger");
//        Pet petya = new Pet(2);

        cat1.getAge();
        cat1.setAge(3);
        Cat.isACat();
        Cat.isBlack = true;

        System.out.println(tiger);

    }
}

