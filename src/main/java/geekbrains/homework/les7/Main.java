package geekbrains.homework.les7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        Bowl bowl = new Bowl(1);
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Жирора", 35);
        cats[2] = new Cat("Кощей", 2);
        bowl.info();
        cats[0].eat(bowl);
        bowl.info();
        cats[1].eat(bowl);
        bowl.info();
        cats[2].eat(bowl);
        bowl.info();
        cats[0].catInfo();
        cats[1].catInfo();
        cats[2].catInfo();
    }
}
