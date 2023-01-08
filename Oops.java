// polymorphism

class Student {

    String name;
    int age;
    float marks;

    public void printInfo(String name){
        System.err.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(float marks){
        System.out.println(marks);
    }

    public void printInfo(String name,int age,float marks){
        System.out.println(name+""+age+""+marks);
    } 
}

// object create

public class Oops {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "shiva";
        s1.age = 21;
        s1.marks = 99;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.marks);

        // or you can call like this also but both attributes prints in same line
        s1.printInfo(s1.name,s1.age,s1.marks);
    }
    
}
