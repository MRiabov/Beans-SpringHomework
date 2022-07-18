package service;

import interfaces.Speakers;
import interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value = "vehicleService")
public class VehicleService{
    private Tyres tyres;
    private Speakers speakers;

    public void playMusic(){
        speakers.play();
    }
    public void drive(){
        tyres.roll();
    }
    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
    @Autowired
    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }
}
