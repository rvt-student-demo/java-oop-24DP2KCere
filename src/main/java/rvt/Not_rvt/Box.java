package rvt.Not_rvt;

import java.util.ArrayList;

public class Box implements Packable{
    private double weight;
    ArrayList<Packable> list = new ArrayList<>();
    
    public Box(double weight){
        this.weight = weight;
    }

    public double weight() {
        double weight = 0;
        
        for (Packable object : list){
            weight = weight + object.weight();
        }

        return weight;
    }

    public void add(Packable object){
        this.list.add(object);

    }

    public String toString(){
        if (weight() > weight){
            return "Box: " + list.size() + " items, total weight: over flow";
        }
        else{
            return "Box: " + list.size() + " items, total weight: " + weight();
        }
    }
}
