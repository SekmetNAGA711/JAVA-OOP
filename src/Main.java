
public class Main {
    public static void main(String[] args) {
       Car car = new Car(); //create a new object of car, instantiation
       car.describeCar(); //calling the method on the car object

        car.setMake("Porsche"); // if these were not set, we would get the default values from the car class
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");


        System.out.println("make =" + car.getMake());
        System.out.println("model = " + car.getModel());


        Car targa = new Car();
        targa.setMake("Porsche"); // if these were not set, we would get the default values from the car class
        targa.setModel("targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("black");
        targa.describeCar();
    }
}

//encapsulation forces users not to access the data directly but through
//a controlled way of setting up the data on the object