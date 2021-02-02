package geekbrains.homework.les7;

public class Bowl {
    private int food;
    public Bowl(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {

        if (food<n)
        {
            System.out.println("Еды меньше чем эта скотина хочет съесть, поэтому тарелка кота даже не привлекает");
            autoAddFood();
            return;
        }
        food -= n;
        while (food < 0) {
            autoAddFood();
        }
    }
    public void info() {
        System.out.println("В миске : " + food+" еды");
    }
    public void autoAddFood()
    {
        this.food +=10;
        System.out.println("Активированно автодобавление еды.");
        info();
    }

    public int getFood() {
        return food;
    }

}
