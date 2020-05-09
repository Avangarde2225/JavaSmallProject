package coreJava;

public class Driver {
    public String fullName;
    public Car car;

    public Driver(String fn, String carName,String carModel){
        fullName = fn;
       car = new Car();
        car.model= carModel;
        car.name = carName;
    }
    public String toString (){
        String result = "";
        result += "full name: " + fullName +"\n";
        result += "car name: " + car.name +"\n";
        result += "car model: " + car.model +"\n";

        return result;
    }
}
class Car{
    public String name;
    public String model;

}
class Main{
    public static void main(String[] args) {
        Driver rookie = new Driver("Halo", "Mazda", " XLS");
        System.out.println(rookie);
    }
}
