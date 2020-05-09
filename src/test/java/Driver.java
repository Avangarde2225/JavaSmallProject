public class Driver {
    public String fullName;
    public Car car;

    public Driver(String fn, String carName,String carModel){
        fullName = fn;
        car = new Car();
        car.model= carModel;
        car.name = carName;
    }
}
class Car{
    public String name;
    public String model;

}
