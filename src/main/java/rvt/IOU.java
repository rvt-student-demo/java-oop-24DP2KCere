package rvt;

import java.util.HashMap;

public class IOU {
    HashMap <String,Double> debt = new HashMap<>();

    public IOU(){

    }

    public void setSum(String toWhom, double amount){
        debt.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        return debt.get(toWhom);
    }
}
