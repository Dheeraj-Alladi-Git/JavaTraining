package objects;

import java.util.Scanner;

public class ArrayObject_3{

    static class Student{
        String name;
        int marks;

        //Default Constructor
        public Student(){
            name = "Unknown";
            marks = 0;
        }

        public Student(String inputName, int inputMarks){
            name = inputName;
            marks = inputMarks;
        }

        public void display(){
            System.out.println("Student " + name + " has obtained Highest Marks of : " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[5];

        for(int i = 0; i < students.length; i++){
            int num = i+1;
            System.out.print(num + ". Enter student Name : ");
            String name = input.nextLine();
            System.out.print("   Enter marks : ");
            int marks = input.nextInt();
            input.nextLine();
            students[i] = new Student(name,marks);

        }
        Student highest = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].marks > highest.marks) {
                highest = students[i];
            }
        }

        highest.display();


    }
}

