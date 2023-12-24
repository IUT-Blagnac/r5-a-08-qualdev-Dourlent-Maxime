package app;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private String owner = "";
    private String target = "";
    private List<String> cocktails = new ArrayList<String>();

    public void declareOwner(String owner){
        this.owner = owner;
    }

    public void declareTarget(String target){
        this.target = target;
    }

    public List<String> getCocktails(){
        return cocktails;
    }
}