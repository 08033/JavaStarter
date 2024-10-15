public class Main {
    public static void main(String[] args) {
        Cat bobCat = new Cat("Jackie", "German");
        Cat blackCat = new Cat("SheCat", "Pakistani");
        String [] BobCatProps = {"Long","Smart","Fast"};
        String [] BlackCatProps = {"Short","Playful"};

        bobCat.SetProperties(BobCatProps);        
        blackCat.SetProperties(BlackCatProps);
        
    }
}
