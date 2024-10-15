//package Inheritance;

public class Main2 {

    private String Title;  
    static int Counter=10;

    public Main2(String title, int startCounter) {        
        this.Title = title;        
        Counter+=startCounter;
    }

    public String getTitle(){
        return this.Title;
    }    
}
