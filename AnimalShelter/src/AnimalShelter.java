import java.util.Queue;
import java.util.LinkedList;

public class AnimalShelter {
    private Queue<Animal> dogs;
    private Queue<Animal> cats;
    private long order;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    public void enqueue(Animal animal) {
        if (animal.getType().equalsIgnoreCase("dog")) {
            dogs.add(animal);
        } else if (animal.getType().equalsIgnoreCase("cat")) {
            cats.add(animal);
        } else {
            throw new IllegalArgumentException("Only dogs and cats are allowed.");
        }

        animal.setArrivalOrder(order++);
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }

        Animal dog = dogs.peek();
        Animal cat = cats.peek();

        if (dog.getArrivalOrder() < cat.getArrivalOrder()) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Animal dequeueDog() {
        return dogs.poll();
    }

    public Animal dequeueCat() {
        return cats.poll();
    }
}
