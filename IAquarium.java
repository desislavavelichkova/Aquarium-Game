package Aquariums;

import Fish.IFish;

import java.util.ArrayList;

public interface IAquarium {
    String name = "";

    String AddFish(IFish fish);
    String RemoveFish(IFish fish);
    String Feed();
    String GetInfo();

}
