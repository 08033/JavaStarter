//package Inheritance;

public class Vehicle {
    
    private String title, color;

    public Vehicle(){        
    }

    public Vehicle(String Title, String Color){      
        this.title = Title;
        this.color = Color;
    }    

    public String getVehicleTitle(){
        return this.title;
    }    
}
