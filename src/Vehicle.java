public class Vehicle {
    private String onwerName;
    private String vechileType;
    private String resoNumber;


    public Vehicle(){

    }
    public Vehicle(String onwerName, String vechileType, String resoNumber){//arg constructor
        this.onwerName = onwerName;
        this.vechileType = vechileType;
        this.resoNumber = resoNumber;
    }

    //setters and getters
    public String getOnwerName(){
        return onwerName;
    }
    public void setOnwerName(String onwerName){
        this.onwerName = onwerName;
    }
    public String getVechileType(){
        return vechileType;
    }
    public void setVechileType(String vechileType){
        this.vechileType = vechileType;
    }
    public String getResoNumber(){
        return resoNumber;
    }
    public void setResoNumber(String resoNumber){
        this.resoNumber = resoNumber;
    }
    public String toString(){
//        return "Vehicle owner:\n"
//                + onwerName + "\nVehilce type:\n" +
//                "" + vechileType + "\nRegistration number:\n" + resoNumber; // while this format worked, it just looks worse
        return "Vehicle owner: " +
                onwerName + "\n" +
                "Vehicle type: " + vechileType + "\n" +
                "Registration Number: " + resoNumber;
    }

}
