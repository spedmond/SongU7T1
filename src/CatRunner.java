import java.util.ArrayList;
import java.util.Locale;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Joey");
        Cat cat2 = new Cat("Max");
        Cat cat3 = new Cat("Jenny");
        Cat cat4 = new Cat("Bob");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat replaced = cats.get(2);
        cats.set(2,cat4);

        System.out.println(cats);
        System.out.println(replaced);

        cat4.setName(cat4.getName() + " Meow");
        cats.set(2,cat4);
        System.out.println(cat4);

        for (Cat cat : cats) {
            cat.setName(cat.getName().toUpperCase());
        }

        System.out.println(cats);

        cats.add(new Cat("SAM"));
    }
}
