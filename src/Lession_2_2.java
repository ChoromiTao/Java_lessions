public class Lession_2_2 {
    public static void main(String[] args) {

        String s = "РџСЂРёРІРµС‚! ";
        String s1 = "РџСЂРёРІРµС‚!";
        s1 = s;

        Thread r = new Thread();
        Thread r1 = new Thread();

        System.out.println(r.equals(r1));
        s.length();
        s.concat("A");
        s += "A";
        s.endsWith("С‚!");
        s.charAt(s.length()/2);
        s.indexOf("СЂРё");
        s.lastIndexOf("!");
        s.getBytes();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(s.length()/2, s.length()-1));
        s.subSequence(1, 3);
        System.out.println(s.repeat(4));
        System.out.println(s.repeat(4).replace("!", "?"));
        System.out.println(s.repeat(4).replace("!", ""));
        String[] tmp = s.repeat(4).split(" ");
        System.out.println(s);

        StringBuilder builder = new StringBuilder("РџСЂРёРІРµС‚! ");
        s = builder.toString();
        builder.append(.235f);
        builder.charAt(0);
        builder.setCharAt(builder.length()/2, 'O');
        builder.deleteCharAt(builder.length()/2-1);
        builder.compareTo(new StringBuilder("!"));
        builder.delete(0, 2);
        builder.insert(builder.length()/2-1, true);
        builder.indexOf("!");
        builder.lastIndexOf("!");
        builder.replace(0, builder.length()/2, "Set new chars");
        builder.reverse();
        System.out.println(builder);

        s = new StringBuilder(s).reverse().toString();

        String str = "";
        StringBuilder stringBuilder = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += Character.getName(i);
        }
        System.out.println("String result: "+ (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(Character.getName(i));
        }
        System.out.println("StringBuilder result: "+ (System.currentTimeMillis() - start));
    }
}
