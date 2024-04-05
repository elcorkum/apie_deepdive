package zoo;

public abstract class Animal {
    //ivar, field, property, attribute

    protected String food;
    public int  id= 0;
    public static int uniqueId;

    private final AnimalSize size;

    public AnimalSize getSize() {
        return size;
    }

    public Animal (String food, AnimalSize size) {
        this.food = food;
        uniqueId++;
        id = uniqueId;
        this.size = size;
    }
    public void makeSound() {
        System.out.println("Unknown animal sound");
    }

    public static void printAnimalMethod(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).fetch();
        }else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }
    }

    public static void printAnimalSize(Animal animal){
        System.out.println("This is a " + animal.getSize() + " animal.");

    }

}
