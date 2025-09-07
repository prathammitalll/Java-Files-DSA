public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Pratham Mittal";
        // myAcc.password = "Hello"; Can't do this private variables are not accessible
        // here
        myAcc.setPassword("abc");

        // Student class

        // Student s1 = new Student("Pratham");
        // System.out.println(s1.name);

        // Constructor Overloading

        // Student s1 = new Student();

        Student s2 = new Student("Pratham");

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        Student s3 = new Student(1481);

        Student s4 = new Student(s3);
        s3.marks[2] = 20;
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }


        // Fish and animal class

        // Fish shark = new Fish();
        // shark.eat();

        // Fish tuna = new Fish();
        // tuna.eat();

        // Multi level Inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // // Hierarchial Inheritance
        // Bird sparrow = new Bird();
        // sparrow.fly();
        // Dog pug = new Dog();
        // pug.walk();
        // Fish fish = new Fish();
        // fish.swim();

        // Method Overloading

        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 6));
        System.out.println(calc.sum((float)5.5, (float)6.2));
        System.out.println(calc.sum(5, 8, 6));

        // Abstraction 
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
    }
}

// class Student {
// String name;
// long rollNo;

// Student(String name) {
// this.name = name;
// }
// }

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}

// Constructor Overloading

class Student {
    String name;
    int roll;
    int marks[];

    // Shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s3.name;
    //     this.roll = s3.roll;
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println();
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}

class Pen {
    // prop + function
    String color;
    int tip;

    String getColor() { // getters
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) { // setters
        this.tip = tip;
    }
}


// Derived Class

// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }

// class student {
// String name;
// int age;
// float percentage;

// void calcPercentage(int phy, int chem, int maths) {

// }
// }



// class Animal {
//     String color;
//     void eat() {
//         System.out.println("eats");
//     }
    
//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// class Mammal extends Animal {
//     int legs;
//     void walk() {
//         System.out.println("walks");
//     }
// }

// class Fish extends Animal {
//     int legs;
//     void swim() {
//         System.out.println("swims");
//     }
// }

// class Bird extends Animal {
//     int legs;
//     void fly() {
//         System.out.println("flys");
//     }
// }

// class Dog extends Mammal {
//     String breed;
// }


// Hybrid Inheritance

// class Fish extends Animal {

// }

// class Tune extends Fish {

// }

// class Shark extends Fish {
    
// }

// class Bird extends Animal {

// }

// class Peacock extends Bird {

// }

// class Mammal extends Animal {

// }

// class Dog extends Mammal {

// }

// class Cat extends Mammal {

// }

// class Human extends Mammal {}


// Method Overloading

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding

// class Animal {
//     void eat() {
//         System.out.println("Eats anything");
//     }
// }

// class Deer extends Animal {
//     void eat() {
//         System.out.println("Eats grass");
//     }
// }

// Abstraction

// abstract class Animal {
//     String color;
//     Animal() { // Constructor
//         color = "brown";
//     }
//     void eat() {
//         System.out.println("animal eat");
//     }
//     abstract void walk(); // It just gives the idea that walk function must be in the child classes
// }

// class Horse extends Animal {
//     void changeColor() {
//         color = "dark brown";
//     }
//     void walk() {
//         System.out.println("4 legs");
//     }
// }

// class Chicken extends Animal {
//     void changeColor() {
//         color = "white";
//     }
//     void walk() {
//         System.out.println("walk on 2 legs");
//     }
// }

// Static Keywords

class Students {
    String name;
    int roll;
    static String schoolName;

    void getName(String name) {
        this.name = name;
    }

    void setName(String name) {

    }
}

// Super Keyword 

class Animal {
    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class horse extends Animal {
    horse() {
        super();
        System.out.println("I am horse");
    }
}