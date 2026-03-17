package rvt.Not_rvt;

public class CD implements Packable{
    private String name;
    private int year;
    private String singer;
    private final double weight = 0.1;

    public CD(String singer,String name,int year){
        this.name = name;
        this.year = year;
        this.singer = singer;

    }
    
    public double weight(){
        return weight;
    }

    public String toString(){
        return singer + ": "+name + "(" + year + ")";
    }
}
