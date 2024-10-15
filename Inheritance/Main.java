//package Inheritance;
import java.text.MessageFormat;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    static int ticks=0;
    public static void main(String[] args) {
        // 1- Strings:
        String message1 = "Hello XD!", message2 = "This is Java Practice";
        int age = 18, cost = 300000;
        String para1 = String.format("""
        ---------------------------------------
        Age: %s \nCost:%s
                """, age, cost);
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(para1);
        System.out.println(MessageFormat.format("Age:{0}, Cost:{1}", age, cost));
        Logger.PrintMessage("-------------------------------");
        //-------------------------------------------------------------------------------
        // 2- Numbers:
        int x = 4;
        System.out.println(String.format("The Sum of 4++ is %s", x++));
        System.out.println(String.format("The Square root of 64 is %s", Math.sqrt(64)));

        int randomNumber = (int) (Math.random() * 101); //Random number between 0 and 100
        System.out.println(String.format("Random generated number: %s", randomNumber));

        String CompareString = (randomNumber > x) ? "Random number is greater than x" : "x is greater than Random number";
        System.out.println("Compare String: " + CompareString);
        Logger.PrintMessage("-------------------------------");
        //-------------------------------------------------------------------------------
        // 3- Arrays:
        String[] cars = {"Suzuki", "Toyota", "Honda"};
        for (int i = 0; i < cars.length; i++) {
            if (i == 2) {
                continue; //Also break
            }
            System.out.println(String.format("car[%s] = %s", i, cars[i]));
        }
        //-------------------------------------------------------------------------------
        // 4- Methods:
        Logger.PrintMessage("Test Function message");
        Logger.PrintMessage("Test Function message again");
        //-------------------------------------------------------------------------------

        //5- Classes/Objects
        Logger.PrintMessage("-------------------------------");
        Main2 m2Obj = new Main2("This is a second class", 10);
        Logger.PrintMessage(m2Obj.getTitle());
        
        //6- Modifiers, constructors
        Logger.PrintMessage("Main2 counter count:");
        Logger.PrintMessage(String.valueOf(Main2.Counter));
        Main2.Counter++;
        Logger.PrintMessage("Main2 counter count again:");
        Logger.PrintMessage(String.valueOf(Main2.Counter));

        
        //-------------------------------------------------------------------------------
        //7- Inheritance
        Logger.PrintMessage("-------------------------------");
        Car SuzukiCar = new Car("Suzuki WagonR VXL 2014", "Beige", 1800000);        
                
        Logger.PrintMessage(SuzukiCar.getVehicleTitle());
        SuzukiCar.Start();
        //SuzukiCar.accelarate();

        //-------------------------------------------------------------------------------
        // https://stackoverflow.com/questions/4044726/how-to-set-a-timer-in-java
        // https://www.geeksforgeeks.org/timer-cancel-method-in-java-with-examples/
        // https://stackoverflow.com/questions/1409116/how-to-stop-the-task-scheduled-in-java-util-timer-class
        
        //8a- Timer fixed
        // Timer t1Timer = new Timer("timert1");
        // t1Timer.schedule(new TimerTask() {
        //     @Override
        //     public void run() {
        //         // Your database code here
        //         SuzukiCar.Stop();
        //     }
        // }, 5 * 1000);

        //8a- Timer regular
        Timer t1Timer = new Timer("timert1");
        
        t1Timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Your database code here
                if(ticks==5){                    
                    cancel();
                    t1Timer.cancel();
                    SuzukiCar.Stop();
                }
                SuzukiCar.accelarate();
                ticks++;                
            }
        }, 3 * 1000, 3 * 1000);
        
        //SuzukiCar.Stop();
    }    

}
