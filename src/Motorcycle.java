public class Motorcycle extends Vehicle{
    private boolean hasGears;
    private int gearCount;
    public Motorcycle(boolean hadGears, int gearCount){
        super("Ana Smith", "Cannondale","REJ-256");
        this.hasGears = hadGears;
        this.gearCount = gearCount;
    }
    public void gear(){
        if(hasGears){
            System.out.println("How many gears the motorcycle has:\n" + gearCount);
        }
        System.out.println("This motorcycle doesn't have gears!");
    }
    @Override
    public String toString() {
        return super.toString() +"\ngear amount: " + gearCount;
    }
}
