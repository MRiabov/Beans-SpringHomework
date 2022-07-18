package implementation;

import interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    @Override
    public void roll() {
        System.out.println("Michelin tyres are rolling...");
    }
}
