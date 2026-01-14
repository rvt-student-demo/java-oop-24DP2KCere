package rvt;

import java.util.*;

public class UserInterface {
    private Scanner ievade;
    private TodoList list;
    public UserInterface(TodoList list , Scanner ievade){
        this.list = list;
        this.ievade = ievade;
    }
    public void start(){
        while (true) {
            System.out.print("Enter the command: ");
            String command = ievade.nextLine();

            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.print("To add: ");
                list.add(ievade.nextLine());
            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number;
                try {
                    number = Integer.valueOf(ievade.nextLine());
                } catch (NumberFormatException nfe) {
                    System.out.println("Nav int ievade");
                    continue;
                }
                list.remove(number);
            }
            if(command.equals("list")){
                list.print();
            }
        }
    }








}
