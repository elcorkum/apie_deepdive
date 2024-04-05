package zoo;

public class RoboDog extends Robot implements Pet{
    @Override
    public void greetOwner() {
        System.out.println("Rolls on wheels and lights up");
    }
}
