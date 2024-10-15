//package AbstractClasses;

public abstract class AbstractOne {
    public int MainId;
    public abstract void MethodOne();

    public void MethodTwo(){
        Logger.PrintMessage("AbstractOne -> MethodTwo invoked");
    }
}
