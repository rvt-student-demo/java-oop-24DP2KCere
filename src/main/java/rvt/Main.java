package rvt;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner ievade = new Scanner(System.in);
    TodoList list = new TodoList();
    UserInterface todoUI = new UserInterface(list, ievade);

    todoUI.start();

  }
}
