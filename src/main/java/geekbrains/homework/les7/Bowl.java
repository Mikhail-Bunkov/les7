package geekbrains.homework.les7;

public class Bowl {
    private int food;
    public Bowl(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food<n)
        {
            System.out.println("Еды меньше чем эта скотина хочет съесть");
            return;
        }
        food -= n;
    }
    public void info() {
        System.out.println("В миске : " + food+" еды");
    }

    public int getFood() {
        return food;
    }
    public void addFood(int food)
    {
        this.food+=food;
    }
}
