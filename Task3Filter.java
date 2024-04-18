package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Filter {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm',25,5);
        Student st2 = new Student("Petr", 'm',35,1);;
        Student st3 = new Student("Fedor", 'm',46,3);;
        Student st4 = new Student("Rita", 'f',23,4);;
        Student st5 = new Student("Polina", 'f',19,2);;
        List<Student>students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students = students.stream().filter(element->element.getAge()> 18 && element.getCourse()>3).collect(Collectors.toList());
        System.out.println(students);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;


    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

   public Student(String name, char sex, int age, int course) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
