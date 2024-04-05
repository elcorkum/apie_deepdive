package zoo;

public class Dog extends Canine implements Pet{

    public Dog(String food, AnimalSize size) {
        super(food, size);
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
    public void fetch() {
        System.out.println("I am a dog and I play fetch!");
    }

    @Override
    public void greetOwner() {
        System.out.println("Wag their tail");
    }
}
