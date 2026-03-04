package rvt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> list;
    private final String filePath = "data/todo.csv";
    private Scanner ievade;

    public TodoList() {
        this.list = new ArrayList<>();
        loadFromFile();
    }

    private void loadFromFile() {
        try (Scanner ievade = new Scanner(new File(filePath))) {
            while (ievade.hasNextLine()) {
                list.add(ievade.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getLastId() { // jāizlasa 50 chapters,jo ta teica Juliāns
        int vertiba = 0;
        try (Scanner ievade = new Scanner(new File(filePath))) {
            ievade.nextLine();
            while (ievade.hasNextLine()) {

                vertiba = vertiba + 1;
                ievade.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return vertiba;
    }

    public void add(String task) {
        int id = getLastId() + 1;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath), true))) {
            String csvRow = id + "," + task;
            bw.newLine();
            bw.write(csvRow);
            list.add(csvRow);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void print() {
      
        for (String task : list) {
            System.out.println(task);
        }
    }

    private void update() {
        String[] masivs;
        String x;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))) {
            for (int i = 0; i < list.size(); i++) {
                x = list.get(i);
                if (i == 0) {
                    bw.write(x);
                    bw.newLine();
                } else {
                    masivs = x.split(",");

                    bw.write(i + "," + masivs[1]);
                    if (i == list.size() - 1)
                        break;
                    bw.newLine();
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void remove(int number) {
        list.remove(number = number - 1);
        update();
    }

}
