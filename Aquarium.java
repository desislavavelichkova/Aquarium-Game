package Aquariums;
import Fish.IFish;
import java.util.ArrayList;

public abstract class Aquarium implements IAquarium {
    private String name;
    private ArrayList<IFish> fishes;

    public Aquarium(String name) {
        this.name = name;
        this.fishes = new ArrayList<IFish>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String AddFish(IFish fish) {
        fishes.add(fish);
        return "Successfully added fish in aquarium";
    }

    @Override
    public String RemoveFish(IFish fish) {
        fishes.remove(fish);
        return "Successfully removed fish.";
    }

    @Override
    public String Feed() {
        if (fishes.size() == 0){
            return "The aquarium is empty.";
        } else {

            for (int i = 0; i < fishes.size(); i++) {
                fishes.get(i).Eat();
            }
            return "You fed " + fishes.size() + " fishes.";
        }
    }

    @Override
    public String GetInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auarium name: " + getName() + " Fishes: " + fishes.size());

        for (int i = 0; i < fishes.size(); i++) {
            sb.append(String.format("%n", ""));
            sb.append(fishes.get(i).GetFishInfo());
        }
        return sb.toString().trim();

    }

}
