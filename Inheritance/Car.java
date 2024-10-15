public class Car extends Vehicle {

    // public Car(){       
    // }    

    public Car(String Tt, String Col, int Price) {
        super(Tt, Col);        
    }

    public void Start(){
        Logger.PrintMessage("Car started");         
    }

    public void Stop(){
        Logger.PrintMessage("Car stopped");
    }

    public void accelarate(){
        Logger.PrintMessage("Car moving");
    }

}
