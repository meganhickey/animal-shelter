public class Main {
    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Animal("Buddy", "Dog"));
        shelter.enqueue(new Animal("Luna", "Cat"));
        shelter.enqueue(new Animal("Max", "Dog"));
        shelter.enqueue(new Animal("Milo", "Cat"));

        Animal adopted = shelter.dequeueAny();

        System.out.println("Adopted: " + adopted.getName());

        Animal adoptedDog = shelter.dequeueDog();
        System.out.println("Adopted dog: " + adoptedDog.getName());

        Animal adoptedCat = shelter.dequeueCat();
        System.out.println("Adopted cat: " + adoptedCat.getName());

        Animal anotherDog = shelter.dequeueDog();

        if (anotherDog != null) {
            System.out.println("Adopted dog: " + anotherDog.getName());
        } else {
            System.out.println("No dogs available for adoption.");
        }
    }
}