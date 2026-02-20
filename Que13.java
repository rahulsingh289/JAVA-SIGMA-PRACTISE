/*  Write a java program to create an interface that consists of a method to display
volume () as an abstract method and redefine this method in the derived classes to suit
their requirements. Create classes called Cone, Hemisphere and Cylinder that implements the
interface. Using these three classes, design a program that will accept dimensions of a cone,
cylinder and hemisphere interactively and display the volumes.
  Volume of cone = (1/3)πr2h
  Volume of hemisphere = (2/3)πr3
  Volume of cylinder = πr2h
 */


 import java.util.Scanner;

// Interface with abstract method
interface Volume {
    void displayVolume(); // abstract method
}

// Cone class implementing Volume interface
class Cone implements Volume {
    double radius, height;

    // Constructor to set dimensions
    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implement displayVolume
    @Override
    public void displayVolume() {
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone = " + volume);
    }
}

// Hemisphere class implementing Volume interface
class Hemisphere implements Volume {
    double radius;

    Hemisphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayVolume() {
        double volume = (2.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Hemisphere = " + volume);
    }
}

// Cylinder class implementing Volume interface
class Cylinder implements Volume {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void displayVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume);
    }
}

// Main class
public class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Cone
        System.out.println("Enter radius of Cone:");
        double coneRadius = sc.nextDouble();
        System.out.println("Enter height of Cone:");
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);

        // Input for Hemisphere
        System.out.println("Enter radius of Hemisphere:");
        double hemiRadius = sc.nextDouble();
        Hemisphere hemisphere = new Hemisphere(hemiRadius);

        // Input for Cylinder
        System.out.println("Enter radius of Cylinder:");
        double cylRadius = sc.nextDouble();
        System.out.println("Enter height of Cylinder:");
        double cylHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(cylRadius, cylHeight);

        System.out.println("\n--- Volumes ---");
        cone.displayVolume();
        hemisphere.displayVolume();
        cylinder.displayVolume();

        sc.close();
    }
}