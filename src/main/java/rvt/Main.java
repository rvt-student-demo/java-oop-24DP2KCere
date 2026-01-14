package rvt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);
        TodoList list = new TodoList();
        UserInterface list2 = new UserInterface(list, ievade);
        
        list2.start();

    }
}
