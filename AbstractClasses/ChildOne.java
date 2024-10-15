public class ChildOne extends AbstractOne {
    public ChildOne(){
        Logger.PrintMessage("Child One instantiated");
    }

    @Override
    public void MethodOne(){
        Logger.PrintMessage("AbstractOne -> ChildOne -> MethodOne invoked");
    }
}
