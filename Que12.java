/*. Write a java program to implement abstract class and abstract method with following details:
  Create a abstract Base Class Temperature
  Data members:
  double temp;
  Method members:
  void setTempData(double)
  abstact void changeTemp()
  Sub Class Fahrenheit (subclass of Temperature)
  Data members:
  double ctemp;
  method member:
  Override abstract method changeTemp() to convert Fahrenheit temperature into degree
  Celsius by using formula C=5/9*(F-32) and display converted temperature Sub Class Celsius
  (subclass of Temperature)
  Data member:
  double ftemp;
  Method member:
 Override abstract method changeTemp() to convert degree Celsius into Fahrenheit 
 temperature by using formula F=9/5*c+32 and display converted temperature
 */


 // Abstract base class
abstract class Temperature {
    double temp; // data member

    // Method to set temperature
    void setTempData(double temp) {
        this.temp = temp;
    }

    // Abstract method to be implemented by subclasses
    abstract void changeTemp();
}

// Subclass Fahrenheit
class Fahrenheit extends Temperature {
    double ctemp;

    // Override abstract method to convert F -> C
    @Override
    void changeTemp() {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.println(temp + " Fahrenheit = " + ctemp + " Celsius");
    }
}

// Subclass Celsius
class Celsius extends Temperature {
    double ftemp;

    // Override abstract method to convert C -> F
    @Override
    void changeTemp() {
        ftemp = (9.0 / 5) * temp + 32;
        System.out.println(temp + " Celsius = " + ftemp + " Fahrenheit");
    }
}

// Main class to test
public class Que12 {
    public static void main(String[] args) {
        // Convert Fahrenheit to Celsius
        Fahrenheit f = new Fahrenheit();
        f.setTempData(100); // example: 100 F
        f.changeTemp();

        // Convert Celsius to Fahrenheit
        Celsius c = new Celsius();
        c.setTempData(37); // example: 37 C
        c.changeTemp();
    }
}
