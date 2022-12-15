package Fish;

public class Fish implements IFish {
    private String name;
    private int size;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void Eat() {
        
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String GetFishInfo() {

        return "   -Fish name: " + getName()+ " Fish size: "  + getSize();
    }
}
