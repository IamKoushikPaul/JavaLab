package LabProblem1;



class Employee {
    public String name;
    public int id;
    public double salary;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Copy Constructor
    public Employee(Employee obj) {
        this.name = obj.name;
        this.id = obj.id;
        this.salary = obj.salary;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    protected void finalize() {
        System.out.println("Employee object destroyed");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        Employee employee2 = new Employee("Koushik", 101, 30000);

        Employee employee3 = new Employee(employee2);

        System.out.println("Default Constructor:");
        employee1.showInfo();

        System.out.println("Parameterized Constructor:");
        employee2.showInfo();

        System.out.println("Copy Constructor:");
        employee3.showInfo();

        employee1 = null;
        employee2 = null;
        employee3 = null;

        System.gc();
    }
}
