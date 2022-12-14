package Fish;

public class SaltWaterFish extends Fish implements IFish {
    private static int size = 3;

    public SaltWaterFish(String name) {
        super(name);
    }
    @Override
    public void Eat() {
        super.Eat();
        size += 1;
    }
    @Override
    public String GetFishInfo() {
        return super.GetFishInfo();
    }
}
