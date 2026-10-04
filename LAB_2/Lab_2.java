package LAB_2;

public class Lab_2 {
    private String name;
    private float cgpa;
    public int id;

    Lab_2() {  //no parameter constructor
        name = "John Doe";
        cgpa = 3.5f;
        id = 2206;

    }

    Lab_2(int id,float cgpa,String name) {  // parameter constructor
        this.name = "KOUSHIK";
        this.cgpa = cgpa;
        this.id = id;

    }
    Lab_2(Lab_2 obj) {  // Copy constructor
        this.name = obj.name;
        this.cgpa = obj.cgpa;
        this.id = obj.id;

    }


    public void display() {
                
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("ID: " + id);
    }

    // public Lab_2(String name, float cgpa, int id) {
    //     this.name = name;
    //     this.cgpa = cgpa;
    //     this.id = id;
    // }

    public static void main(String[] args) {
        Lab_2 obj1 = new Lab_2();
        obj1.display();

        Lab_2 obj2 = new Lab_2(2207, 3.8f, "Jane Smith");
        obj2.display();

        Lab_2 obj3 = new Lab_2(obj2);
        obj3.display();
    }


}
