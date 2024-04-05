package zoo;

public class Cat extends Feline implements Pet{
    public Cat(String food, AnimalSize size) {
        super(food, size);
    }

    public void makeSound() {
        System.out.println("meow meow");
    }
    public void scratch(){
        System.out.println("I can scratch");
    }

    @Override
    public void greetOwner() {
        System.out.println("Purr and roll on their back");
    }
}
