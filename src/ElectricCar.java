public class ElectricCar extends Vehicle{

    private double kiloWatHours;

    public ElectricCar(double kiloWatHours){
        super("Julian C", "Tesla Model X","CDD7066");
        this.kiloWatHours = kiloWatHours;

    }
    public double getKiloWatHours() {
        return kiloWatHours;
    }
    public void setKiloWatHours(double kiloWatHours) {
        this.kiloWatHours = kiloWatHours;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTotal kilowatt hours: " + kiloWatHours ;
    }
}
