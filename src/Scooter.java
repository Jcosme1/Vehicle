public class Scooter extends Vehicle {
    private double maxSpeed;
    private double weightCapacity;
    public Scooter(double maxSpeed, double weightCapacity){
        super("Alex Sanders", "Yamaha", "WEU-445");
        this.maxSpeed = maxSpeed;
        this.weightCapacity = weightCapacity;
    }
    @Override
    public String toString(){
        return super.toString() +"\nMax capacity: " + weightCapacity +" Lb's"+"\nMax speed: " + maxSpeed + "km/h";

    }

}
