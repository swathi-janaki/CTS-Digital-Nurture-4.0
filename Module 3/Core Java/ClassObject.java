
class Car {
    
    String make;
    String model;
    int year;
   
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("-------------------------");
    }
}


public class CarTest {
    public static void main(String[] args) {
       
        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("Honda", "Civic", 2020);

        
        car1.displayDetails();
        car2.displayDetails();
    }
}
