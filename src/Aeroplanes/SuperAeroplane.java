package Aeroplanes;

public class SuperAeroplane {
    public String model;
    public String pilot;
    public int capacity;
    public int speed;
    public boolean inAir;
    public double positionX;
    public double positionY;
    // in feet
    public int altitude;
    public double machSpeed;

    public SuperAeroplane(String model, String pilot, int capactiy, int speed,double machSpeed, boolean inAir,int altitude) {
        this.model = model;
        this.pilot = pilot;
        this.capacity = capactiy;
        this.speed = speed;
        this.inAir = inAir;
        //this.positionX = positionX;
        //this.positionY = positionY;
        this.altitude = altitude;
        this.machSpeed = machSpeed;
    }
    public String getModel(){
        return model;
    }
    public String getPilot(){
        return pilot;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean getInAir(){
        return inAir;
    }
    public int getAltitude(){
        return altitude;
    }
    public double getMachSpeed(){
        return machSpeed;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPilot (String pilot) {
        this.pilot = pilot;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setInAir(boolean inAir){
        this.inAir= inAir;
    }
    public void setAltitude(int altitude){
        this.altitude = altitude;
    }
    public void setMachSpeed(double machSpeed){
        this.machSpeed = machSpeed;
    }


    public Object info(){
        System.out.println("\nThe plane model is: "+ getModel() + "\nThe pilot is: " + getPilot() + "\nThis plane's capacity is: " + getCapacity() + "\nThe plane's maximum speed is: " + getSpeed()+ "\nConversion to Mach Speed:" + getMachSpeed()+ "\nThe plane is currently in air: " + getInAir() + "\nThe altitude the plane is currently at is:  " + getAltitude());

        return null;
    }
}