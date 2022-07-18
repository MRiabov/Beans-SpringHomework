package implementation;

import interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public void roll() {
        System.out.println("BridgeStone tyres are rolling...");
    }
}
