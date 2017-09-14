package com.company;

import java.io.Serializable;

    public class Student implements Serializable {

        private static final long serialVersionUID = 1L;

        String name;
        int age;
        int averRating;

        public Student(String name, int age, int averRating) {
            this.name = name;
            this.age = age;
            this.averRating = averRating;
        }

        public Student() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAverRating() {
            return averRating;
        }

        public void setAverRating(int averRating) {
            this.averRating = averRating;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", averRating=" + averRating +
                    '}';
        }
    }
