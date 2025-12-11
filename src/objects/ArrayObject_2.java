package objects;
import java.util.Scanner;

public class ArrayObject_2 {

    static class Employee{
        String name;
        String designation;
        int salary;


        //Default Constructor
        public Employee(){
            name = null;
            designation = null;
            salary = 0;
        }

        public Employee(String inputName, String inputDesignation, int inputSalary){
            name = inputName;
            designation = inputDesignation;
            salary = inputSalary;
        }

        public void display(){
            if(salary > 50000){
            System.out.println(name + " " + designation + " " + salary);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employee = new Employee[3];

        for(int i = 0; i < employee.length; i++){
            int num = i+1;
            System.out.print(num + ". Enter Employee Name :");
            String empName = input.nextLine();
            System.out.print("   Enter Designation : ");
            String empDesignation = input.nextLine();
            System.out.print("   Enter Salary : ");
            int empSalary = input.nextInt();
            input.nextLine();
            employee[i] = new Employee(empName,empDesignation,empSalary);

        }
        System.out.println("Employee_Name " + " Designation " + "Salary");
        for(Employee emp : employee){
            emp.display();
        }


    }
}