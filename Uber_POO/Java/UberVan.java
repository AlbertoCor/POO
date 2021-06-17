import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;
    private Integer passenger;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    public UberVan(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted, 
    ArrayList<String> seatMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }

    @Override
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Need assign 6 passengers");
        }
    }
}