package geekbrains.homework.les7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Bowl a) {
        if(satiety) {
            return;
        }
        a.decreaseFood(appetite);

        satiety = true;
    }
    public String satietyStatus(boolean satiety)
    {
        if (satiety)
        {
            return "Сыт";
        }
        return "Не сыт";

    }

    public void catInfo()
    {
        System.out.println("Состояние кота "+ name+" - "+satietyStatus(satiety));
    }


}
