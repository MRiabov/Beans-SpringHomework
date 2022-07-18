package implementation;

import interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public void play() {
        System.out.println("Rock music is playing...");
    }
}
