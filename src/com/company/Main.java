package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Group MZD = new Group();
        MZD.addStudent("Morozov",20,5);
        MZD.addStudent("Sidorov", 19, 4);
        MZD.addStudent("Petrov",18,5);

        MZD.printInfo();

        //MZD.deleteStudent("dgfjh"); метод работает некорректно, может удадить несуществующего студента

        try(ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("newFile"))){

            OOS.writeObject(MZD);

                }catch(IOException e){

            System.out.println("Try again");
        }

        Group NewGroup = null;

            try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("newFile"))){

                NewGroup = (Group)OIS.readObject();

                }catch(IOException | ClassNotFoundException e){

            System.out.println("Invalid loading");
        }

        System.out.println("New group is created");

        NewGroup.printInfo();
    }
}
