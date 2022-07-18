import beans.Car;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Car car = context.getBean(Car.class);
        car.getVehicleService().drive();
        car.getVehicleService().playMusic();
    }

}
