package Hw;

public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.checkEngine();
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
}
