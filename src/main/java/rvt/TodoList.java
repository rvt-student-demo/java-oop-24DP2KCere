package rvt;

import java.util.ArrayList;

public class TodoList {
     ArrayList<String> list = new ArrayList<>();
     
    public void add(String task){

            list.add(task);
    }

    public void print(){
         int i =1;
        for (String task : list) {
           
            System.out.println(i + ": " + task);

            i ++;
        }

    }

    public void remove(int number){
        list.remove(number = number - 1);
    }




}
