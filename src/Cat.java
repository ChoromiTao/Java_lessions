import java.util.Random;

public class Cat extends Pet {
    private int age;
    public static boolean isBlack;
    public String name;

    private Cat(String name, int age) {
        super(4);
        if (name != null) this.name = name;
        setAge(age);
    }

    public Cat() {
        super(4);
    }

    public Cat(String name) {
        this(name, new Random().nextInt(30));
    }

    public int getAge() {
        return age;
    }

    public static boolean isACat() {
        return new Random().nextBoolean();
    }

    public boolean setAge(int age) {
        if (age < 0 || age > 30) {
            age = 0;
            return false;
        }
        this.age = age;
        return true;
    }
}
