public class Tiger extends Cat {
    public float speed;
    public boolean dangerous;

    public Tiger(String name) {
        super(name);
        super.setAge(5);
    }

    @Override
    public boolean setAge(int age) {
        if (age < 0 || age > 45) {
            super.setAge(0);
            return false;
        }
        super.setAge(age);
        return true;
    }

    @Override
    public String toString() {
        return name + String.valueOf(getPaws());
    }
}
