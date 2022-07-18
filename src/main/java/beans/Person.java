package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import beans.Car;

@Component(value="personBean")
public class Person {
    private final String name="Lucy";
    Car car;
    @Autowired
    public Person(Car car) {
        this.car = car;
    }

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
}
