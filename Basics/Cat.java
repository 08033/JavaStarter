
public class Cat implements IAnimal {

    private String name, breed;

    public Cat(String Name, String Breed) {
        name = Name;
        breed = Breed;
    }

    @Override
    public void SetProperties(String[] Props) {
        //https://www.geeksforgeeks.org/string-array-with-enhanced-for-loop-in-java/
        Logger.PrintMessage(String.format("Cat:[%s] Properties:",this.name));
        Logger.PrintMessage(String.format("Breed:%s", this.breed));
        for (String str : Props) {
            Logger.PrintMessage(str);
        }
    }
}
