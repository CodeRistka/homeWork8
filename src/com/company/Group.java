package com.company;

import java.io.Serializable;

public class Group implements Serializable {

    private Student[] group;

    private static final long serialVersionUID = 1L;

    Group() {
        group = new Student[0];
    }

    public Student[] getGroup() {
        return group;
    }

    public void addStudent(String name, int age, int averRating) {
        Student[] c = new Student[group.length + 1];
        System.arraycopy(group, 0, c, 0, group.length);
        c[c.length - 1] = new Student(name, age, averRating);
        group = c;
    }

  public void deleteStudent(String name) throws Exception {
       try{
           for (int j = 0; j < group.length; j++) {
               if (group[j] != null && (group[j].getName().equals(name))) {
                   group[j] = null;
                   System.out.println("Student " + name + " removed");
                   break;
               }
           }
       }catch (Exception e){
           System.out.println("error");
       }
}


    public void printInfo() {
        for (Student i : group) {
            System.out.println(i);
        }
    }
}
