package airconditioner;

public class AirConditioner {
    private int temperature;
    private boolean AcIsOn;

    public void setTemperature(){
    }
    public int getTemperature(){
        return temperature;
    }
    public void isOn(boolean AcIsOn) {
        this.AcIsOn = AcIsOn;
    }

    public boolean checkPower() {
        return AcIsOn;
    }
}
