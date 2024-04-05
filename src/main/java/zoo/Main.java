package zoo;

public class Main {
    public static void main(String[] args){
        //Animal animal = new Animal();  this is illegal. an abstract class cannot be instantiated.

        Dog dog = new Dog("bones", AnimalSize.SMALL);
        dog.makeSound();
        System.out.println("===================");

        Cat cat = new Cat("milk", AnimalSize.TINY);
        cat.food = "mice";
        cat.makeSound();
        System.out.println(cat.food);

        Animal dogToCat = new Dog("bones", AnimalSize.SMALL);

        dogToCat = new Cat("Fish", AnimalSize.TINY);
        ((Cat)dogToCat).scratch();

        RoboDog robodog = new RoboDog();

        Pet[] pets = {dog, cat, robodog};

        Pet.printPetGreeting(pets);

        robodog.printPetClassName(robodog);

        Animal.printAnimalSize(dog);
        Animal.printAnimalSize(cat);





    }
}
