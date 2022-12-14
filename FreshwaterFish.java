package Fish;

public class FreshwaterFish extends Fish implements IFish {
    private static int size = 3;

    public FreshwaterFish(String name) {
        super(name);
    }
    @Override
    public void Eat() {
        super.Eat();
        size += 3;
    }

    @Override
    public String GetFishInfo() {
        return super.GetFishInfo();
    }
}
