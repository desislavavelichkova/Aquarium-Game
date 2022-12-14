package Controller;
import Aquariums.IAquarium;
import Fish.Fish;
import java.util.ArrayList;
public  class Controller implements IController{

    private ArrayList<IAquarium> aquariums;

    public Controller() {
        this.aquariums = new ArrayList<IAquarium>();
    }

    public ArrayList<IAquarium> getAquariums() {
        return aquariums;
    }

    public void setAquariums(ArrayList<IAquarium> aquariums) {
        this.aquariums = aquariums;
    }

    @Override
    public String AddAquarium(IAquarium aquarium) {
            aquariums.add(aquarium);
        return "Seccessfully created aquarium.";
    }

    @Override
    public String AddFish(int aquariumIndex, Fish fish) {
        aquariums.get(aquariumIndex).AddFish(fish);
        return "Successfully added the fish in aquarium.";
    }

    @Override
    public String FeedFish(int aquariumIndex) {
        IAquarium currAquarium = aquariums.get(aquariumIndex);
        System.out.println(currAquarium.Feed());
        return "Good job!";
    }

    @Override
    public String Report() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < aquariums.size(); i++) {
            sb.append(aquariums.get(i).GetInfo() );
            sb.append(String.format("%n%n", ""));
        }
        return sb.toString().trim();
    }
}
