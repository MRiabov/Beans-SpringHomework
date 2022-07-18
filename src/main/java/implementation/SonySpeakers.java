package implementation;

import interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public void play() {
        System.out.println("Classical music is playing...");
    }
}
