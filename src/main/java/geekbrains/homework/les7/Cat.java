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
        int foodInBowl1 = a.getFood();
        a.decreaseFood(appetite);
        int foodInBowl2 = a.getFood();
        if(foodInBowl1 == foodInBowl2)
        {
            return;
        }
        satiety = true;
    }

}
