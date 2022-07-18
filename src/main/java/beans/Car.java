package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.VehicleService;

@Component(value = "carBean")
public class Car {
    private VehicleService vehicleService;
    @Autowired
    public Car(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
