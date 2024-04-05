package zoo;

public interface Pet {
    //by default methods are public and abstract
    //we do not need to indicate the methods as abstract
    //interfaces can have default methods

    void greetOwner();

    //default method
    //this is a fairly new concept in Java
    default void printPetClassName(Pet pet) {
        System.out.println(pet.getClass().getSimpleName());
    }

    //interfaces can also have static methods
    //This static method has an enhanced for loop of forEachLoop
    static void printPetGreeting(Pet[] pets){
        for(Pet pet : pets) {
            pet.greetOwner();
        }
    }
}
