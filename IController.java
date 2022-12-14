package Controller;

import Aquariums.IAquarium;
import Fish.Fish;

public interface IController {

    String AddAquarium(IAquarium aquarium);
    String AddFish(int aquariumIndex, Fish fish);
    String FeedFish(int aquariumIndex);
    String Report();
}
