package geekbrains.homework.les7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Bowl a) {
        if(satiety)
        {
            return;
        }
        int foodInBowl1 = a.getFood();
        a.decreaseFood(appetite);
        int foodInBowl2 = a.getFood();
        if(foodInBowl1 == foodInBowl2)
        {
            a.autoExtraAddFood();
            System.out.println("Активированно автодобавление еды");
            eat(a);
            return;
        }
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
